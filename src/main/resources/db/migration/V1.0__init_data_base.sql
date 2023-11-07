CREATE TABLE `post`
(
    `id`      bigint NOT NULL,
    `version` bigint NOT NULL,
    `post_id` bigint NOT NULL
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;

ALTER TABLE `post`
    ADD PRIMARY KEY (`id`),
    ADD UNIQUE KEY `post_id` (`post_id`);

ALTER TABLE `post`
    MODIFY `id` bigint NOT NULL AUTO_INCREMENT;

CREATE TABLE `user`
(
    `id`      bigint      NOT NULL,
    `version` bigint      NOT NULL,
    `user_id` bigint      NOT NULL,
    `name`    varchar(50) NOT NULL
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;

ALTER TABLE `user`
    ADD PRIMARY KEY (`id`),
    ADD UNIQUE KEY `user_id` (`user_id`);

ALTER TABLE `user`
    MODIFY `id` bigint NOT NULL AUTO_INCREMENT;