<script setup>
import { RouterView, RouterLink } from "vue-router";
import SettingNav from "@/views/setting/components/SettingNav.vue";
</script>

<template>
  <div class="container">
    <SettingNav />
    <RouterView />
  </div>
</template>

<style scoped>
.container {
  display: flex;
  width: 100%;
  min-height: 1000px;
  align-items: stretch;

  border-left: 1px solid var(--border-gray);
  border-right: 1px solid var(--border-gray);
}
</style>
