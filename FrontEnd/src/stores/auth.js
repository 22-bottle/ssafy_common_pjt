import { localAxios } from "@/utils/http-common";

const local = localAxios();

// API 요청 예시
// local
//   .get("/url")
//   .then((response) => {
//     console.log(response.data);
//   })
//   .catch((error) => {
//     console.error(error);
//   });

// * ///////////////////////
// 기존 코드

// import { ref, computed } from "vue";
// import { defineStore } from "pinia";
// import axios, { all } from "axios";
// import router from "@/router/index.js";

// export const useAuthStore = defineStore(
//   "auth",
//   () => {
//     const API_URL = "";
//     // 회원가입 로직
//     const signUp = function (payload) {
//       const { username, password1, password2, email, salary } = payload;
//       console.log(payload);

//       axios({
//         method: "post",
//         url: `${API_URL}/accounts/signup/`,
//         data: {
//           username,
//           password1,
//           password2,
//           email,
//           salary,
//         },
//       })
//         .then((res) => {
//           console.log("회원가입 완료", res.data);
//           const password = password1;
//           logIn({ username, password });
//         })
//         .catch((err) => console.log(err));
//     };

//     // 토큰
//     const token = ref(null);

//     // 로그인 여부
//     const isAuthenticated = computed(() => {
//       if (token.value === null) {
//         return false;
//       } else {
//         return true;
//       }
//     });

//     const userId = ref("default");

//     // 로그인 로직
//     const logIn = function (payload) {
//       const { username, password } = payload;

//       axios({
//         method: "post",
//         url: `${API_URL}/accounts/login/`,
//         data: {
//           username,
//           password,
//         },
//       })
//         .then((res) => {
//           token.value = res.data.key;
//           userId.value = `${username}`;
//           getRates();
//           getUserData({ username });
//           window.alert("로그인 완료");
//           router.push({ name: "Home" });
//         })
//         .catch((err) => console.log(err));
//     };

//     const userData = ref([]);

//     const getUserData = function (payload) {
//       const { username } = payload;
//       axios({
//         method: "get",
//         url: `${API_URL}/account/get_data/${username}/`,
//       })
//         .then((res) => {
//           userData.value = res.data;
//           console.log("유저 정보", userData.value);
//         })
//         .catch((err) => console.log(err));
//     };

//     const logOut = function () {
//       axios({
//         method: "post",
//         url: `${API_URL}/accounts/logout/`,
//       })
//         .then((res) => {
//           token.value = null;
//           userId.value = "default";
//           router.push({ name: "Home" });
//         })
//         .catch((err) => {
//           console.log(err);
//         });
//     };

//     return {
//       API_URL,
//       signUp,
//       logIn,
//       logOut,
//       token,
//       isAuthenticated,
//       userId,
//       userData,
//     };
//   },
//   { persist: true }
// );
