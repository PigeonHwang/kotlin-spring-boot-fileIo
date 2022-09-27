CREATE TABLE IF NOT EXISTS "files" (
    "id" BIGSERIAL PRIMARY KEY,
    "file_name" VARCHAR(255) NOT NULL,
    "file_dir" TEXT NOT NULL,
    "file_origin_name" VARCHAR(255) NOT NULL,
    "file_size" INTEGER NOT NULL,
    "created_at" TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    "updated_at" TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);