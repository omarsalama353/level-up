const textElement = document.querySelector('.typing-text');
const message = textElement.innerText;
textElement.innerText = '';

let i = 0;
function typeWriter() {
    if (i < message.length) {
        textElement.innerHTML += message.charAt(i);
        i++;
        setTimeout(typeWriter, 50); // Speed of typing
    }
}

// Start typing when the page loads
window.onload = typeWriter;
window.addEventListener('DOMContentLoaded', (event) => {
    const notification = document.querySelector('.game-notification');
    
    // 1. Optional: Start typing effect (from previous step)
    typeWriter(); 

    // 2. Wait 5000ms (5 seconds) then add the 'fade-out' class
    setTimeout(() => {
        notification.classList.add('fade-out');
    }, 5000); 
});