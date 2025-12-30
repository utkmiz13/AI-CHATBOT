let currentLang = "en";
let T = EN; // default language

function changeLanguage(lang) {
  currentLang = lang;
  T = lang === "hi" ? HI : EN;
  updateUILanguage();
}

function updateUILanguage() {
  document.getElementById("askAbout").innerText = T.askAbout;
  document.getElementById("t-courses").innerText = T.courses;
  document.getElementById("t-fees").innerText = T.fees;
  document.getElementById("t-admissions").innerText = T.admissions;
  document.getElementById("t-campus").innerText = T.campus;
  document.getElementById("t-placements").innerText = T.placements;
  document.getElementById("t-pyq").innerText = T.pyq;

  document.getElementById("btn-courses").innerText = T.btnCourses;
  document.getElementById("btn-fees").innerText = T.btnFees;
  document.getElementById("btn-admission").innerText = T.btnAdmission;
  document.getElementById("btn-facilities").innerText = T.btnFacilities;
  document.getElementById("btn-placement").innerText = T.btnPlacement;
  document.getElementById("btn-contact").innerText = T.btnContact;
  document.getElementById("btn-scholarship").innerText = T.btnScholarship;
  document.getElementById("btn-pyq").innerText = T.btnPYQ;
  document.getElementById("btn-syllabus").innerText = T.btnSyllabus;
  document.getElementById("btn-telegram").innerText = T.btnTelegram;
  document.getElementById("btn-samarth").innerText = T.btnSamarth;
  document.getElementById("btn-youtube").innerText = T.btnYoutube;
  document.getElementById("btn-ragging").innerText = T.btnRagging;

  document.getElementById("welcome-title").innerText = T.welcome;
  document.getElementById("welcome-desc").innerText = T.welcomeDesc;
}
