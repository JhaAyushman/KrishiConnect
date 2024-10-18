const FarmProducePayment = artifacts.require("FarmProducePayment");

module.exports = function (deployer, network, accounts) {
    const consumerAddress = accounts[1]; // Assume the second account is the consumer
    const price = web3.utils.toWei('0.1', 'ether'); // Price in Ether
    deployer.deploy(FarmProducePayment, consumerAddress, price);
};
