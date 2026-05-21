    // Select the button and the paragraph element
const btn = document.getElementById("myButton");
const msg = document.getElementById("message");

// Add a click event listener to the button
btn.addEventListener("click", function() {
  // Update the text content of the paragraph
  msg.textContent = "$1,000";
});