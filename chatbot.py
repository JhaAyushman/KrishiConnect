import google.generativeai as ai

# Configure your API key
API_KEY = 'AIzaSyCueB0he2sQ5p_L4nMB8df4fNtVPVcSVwQ'
ai.configure(api_key=API_KEY)

# Keywords related to agricultural support
agriculture_keywords = [
    "crop management", "pest control", "fertilization", "irrigation", 
    "soil health", "sustainable farming", "agricultural techniques", 
    "crop rotation", "organic farming", "harvest", "market trends", 
    "farm equipment", "weather patterns", "disease management", "crop name", "crop type"
]

# Function to check if the message is related to agriculture
def is_agriculture_related(message):
    message_lower = message.lower()
    return any(keyword in message_lower for keyword in agriculture_keywords)

# Initiate the chat
try:
    model = ai.GenerativeModel("gemini-pro")
  # Adjust model name if needed
    chat = model.start_chat()

    while True:
        message = input('You: ')
        if message.lower() == 'bye':
            print('Chatbot: Goodbye!')
            break
        
        # Check if the message is related to agriculture
        if is_agriculture_related(message):
            response = chat.send_message(message)
            print('Chatbot:', response.text)
        else:
            print('Chatbot: I can only answer questions related to agricultural support.')

except Exception as e:
    print(f"Error occurred: {e}")