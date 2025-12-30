const chatBox = document.getElementById("chatBox");
const userInput = document.getElementById("userInput");

const knowledgeBase = {
    courses: "DSMNRU offers B.Tech, MBA, MCA, BA, BSc, BCom, Law, BASLP, MTech, MSc, PhD and more.",
    fees: "Fees range from ₹8,000 to ₹1.2L per year depending on course. Divyang students get major concessions.",
    admission: "Admissions via CUET-UG, CUET-PG, JEE Main and counseling.",
    facilities: "Barrier-free campus, hostels, library, medical center, sports complex.",
    placement: "Average package ₹3–5 LPA. Top recruiters: Wipro, HCL, IBM.",
    scholarships: "UP Scholarship, NHFDC, Central Govt Divyang schemes.",
    contact: "Mohaan Road, Lucknow | Website: dsmru.up.nic.in"
};

function sendMessage() {
    const msg = userInput.value.trim();
    if (!msg) return;

    chatBox.innerHTML += `<div class="user-message">${msg}</div>`;
    userInput.value = "";

    let reply = "Please ask about DSMNRU only.";
    const text = msg.toLowerCase();

    if (text.includes("course")) reply = knowledgeBase.courses;
    else if (text.includes("fee")) reply = knowledgeBase.fees;
    else if (text.includes("admission")) reply = knowledgeBase.admission;
    else if (text.includes("facility")) reply = knowledgeBase.facilities;
    else if (text.includes("placement")) reply = knowledgeBase.placement;
    else if (text.includes("scholarship")) reply = knowledgeBase.scholarships;
    else if (text.includes("contact")) reply = knowledgeBase.contact;

    chatBox.innerHTML += `<div class="bot-message">${reply}</div>`;
    chatBox.scrollTop = chatBox.scrollHeight;
}

function quickAsk(text) {
    userInput.value = text;
    sendMessage();
}

function toggleDarkMode() {
    document.body.classList.toggle("dark-mode");
}

function clearChat() {
    chatBox.innerHTML = "";
}

function openOfficialSite() {
    window.open("https://dsmru.up.nic.in/", "_blank");
}

function openPYQSite() {
    window.open("https://dsmnru-pyq.netlify.app/", "_blank");
}

function openPYQBot() {
    window.open("https://t.me/dsmnru_pyq_syll_bot", "_blank");
}
