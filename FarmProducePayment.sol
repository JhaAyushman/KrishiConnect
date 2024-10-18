// SPDX-License-Identifier: MIT
pragma solidity ^0.8.0;

contract FarmProducePayment {
    address public farmer;
    address public consumer;
    uint public price;
    bool public isDelivered;

    event ProduceDelivered(address indexed consumer, uint amountPaid);
    event PaymentReleased(address indexed farmer, uint amount);

    constructor(address _consumer, uint _price) {
        farmer = msg.sender; 
        consumer = _consumer;
        price = _price;
        isDelivered = false;
    }

    
    function confirmDelivery() public {
        require(msg.sender == consumer, "Only the consumer can confirm delivery");
        require(!isDelivered, "Produce has already been delivered");

        isDelivered = true;
        emit ProduceDelivered(consumer, price);
    }

    
    function payForProduce() public payable {
        require(msg.sender == consumer, "Only the consumer can pay");
        require(msg.value == price, "Incorrect amount sent");
        require(isDelivered, "Produce must be delivered before payment");

        
        payable(farmer).transfer(msg.value);
        emit PaymentReleased(farmer, msg.value);
    }

    // Function to check the contract balance
    function contractBalance() public view returns (uint) {
        return address(this).balance;
    }
}

