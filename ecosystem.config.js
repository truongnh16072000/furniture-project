module.exports = {
  apps: [
    {
      name: "furniture-project",
      script: "java",
      args: "-jar build/libs/furniture-project-0.0.1-SNAPSHOT.jar",
      cwd: "/Users/truongnh/Documents/english/furniture-project",
      instances: 1,
      autorestart: true,
      watch: false,
      max_memory_restart: "1024M",
      env: {
        SPRING_PROFILES_ACTIVE: "prod"
      },
      log_date_format: "YYYY-MM-DD HH:mm Z",
      error_file: "logs/error.log",
      out_file: "logs/out.log",
      merge_logs: true,
    },
  ],
};
