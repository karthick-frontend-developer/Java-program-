function sendMessage() {
    let userInput = document.getElementById("user-input").value.trim();
    if (userInput === "") return; // If empty, don't send

    // Display user message
    let chatBox = document.getElementById("chat-box");
    let userMessage = `<p class="user-message">${userInput}</p>`;
    chatBox.innerHTML += userMessage;
    
    // Get chatbot response
    let botResponse = getBotResponse(userInput);
    let botMessage = `<p class="bot-message">${botResponse}</p>`;
    chatBox.innerHTML += botMessage;
    
    // Clear input field
    document.getElementById("user-input").value = "";
    
    // Auto-scroll to latest message
    chatBox.scrollTop = chatBox.scrollHeight;
}

// Simple AI response logic
function getBotResponse(input) {
    input = input.toLowerCase(); // Convert to lowercase for better matching

    if (input.includes("hello") || input.includes("hi")) {
        return "Hello! How can I assist you today?";
    } else if (input.includes("how are you"))
