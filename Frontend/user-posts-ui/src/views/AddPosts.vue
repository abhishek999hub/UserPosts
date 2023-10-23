<template>
   
    <div class="container">
        <div>Add Posts</div>
    </div>
    <div class="row">
        <div class="col-5"></div>
        <form>
            <div class="form-group">
                <label>UserId</label>
                <input type="text" class="form-control" v-model="user_id">
            </div>
            <div class="form-group">
                <label>title</label>
                <input type="text" class="form-control" v-model="title">
            </div>
            <div class="form-group">
                <label>body</label>
                <input type="text" class="form-control" v-model="body">
            </div>
            <button type="button" @click="addPost">Post</button>
        </form>
    </div>
</template>
<script>
import axios from "axios";

export default {
  data() {
    return {
      user_id: "",
      title: "",
      body: "",
    };
  },
  methods: {
    addPost() {
      const newPost = {
        user_id: this.user_id,
        title: this.title,
        body: this.body,
      };

      const baseUrl = "http://localhost:8088"; 

      axios
        .post(`${baseUrl}/posts`, newPost, {
          headers: {
            'Content-Type': 'application/json',
          },
        })
        .then(() => {
        })
        .catch((err) => {
          console.log(err);
        });
    },
  },
};
</script>
<style scoped>

</style>