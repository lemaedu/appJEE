CREATE TABLE "tb_acceso" (
"id_acceso" serial4 NOT NULL,
"_id_opcion" int4,
"_id_rol" int4,
"status" bool,
"user_create" int8,
"user_update" int8,
"user_delete" int8,
"date_create" date,
"date_update" date,
"date_delete" date,
CONSTRAINT "tb_accesos_pkey" PRIMARY KEY ("id_acceso") 
)
WITHOUT OIDS;
COMMENT ON COLUMN "tb_acceso"."id_acceso" IS 'pk tabla';
COMMENT ON COLUMN "tb_acceso"."_id_opcion" IS 'fk (pk tabla opcion)';
COMMENT ON COLUMN "tb_acceso"."_id_rol" IS 'fk (pk tb_rol)';
COMMENT ON COLUMN "tb_acceso"."status" IS 'estado (true=activo,false=inactivo)';
COMMENT ON COLUMN "tb_acceso"."user_create" IS 'Usuario que da alta';
COMMENT ON COLUMN "tb_acceso"."user_update" IS 'usuario ultima actualizacion';
COMMENT ON COLUMN "tb_acceso"."user_delete" IS 'usuario que da baja';
COMMENT ON COLUMN "tb_acceso"."date_create" IS 'fecha  alta';
COMMENT ON COLUMN "tb_acceso"."date_update" IS 'fecha ultima modificacion';
COMMENT ON COLUMN "tb_acceso"."date_delete" IS 'fecha baja';
ALTER TABLE "tb_acceso" OWNER TO "postgres";

CREATE TABLE "tb_menu" (
"id_menu" serial4 NOT NULL,
"nombre" varchar(50),
"img" varchar(75),
"_id_ubicacion_menu" int4,
"status" bool DEFAULT true,
"user_create" int8,
"user_update" int8,
"user_delete" int8,
"date_create" date,
"date_update" date,
"date_delete" date,
CONSTRAINT "tb_menu_pkey" PRIMARY KEY ("id_menu") 
)
WITHOUT OIDS;
COMMENT ON COLUMN "tb_menu"."id_menu" IS 'pk tabla menu';
COMMENT ON COLUMN "tb_menu"."nombre" IS 'guarda nombre menu(admimistracion, reportes)';
COMMENT ON COLUMN "tb_menu"."img" IS 'guarda imagen de menu si existe';
COMMENT ON COLUMN "tb_menu"."_id_ubicacion_menu" IS 'fk (pk de ubicacion menu)';
COMMENT ON COLUMN "tb_menu"."status" IS 'estado (true=activo,false=inactivo)';
COMMENT ON COLUMN "tb_menu"."user_create" IS 'usuario q da alta';
COMMENT ON COLUMN "tb_menu"."user_update" IS 'usuario que actualiza';
COMMENT ON COLUMN "tb_menu"."user_delete" IS 'usuario que da baja';
COMMENT ON COLUMN "tb_menu"."date_create" IS 'fecha de alta';
COMMENT ON COLUMN "tb_menu"."date_update" IS 'fecha de actualizacion';
COMMENT ON COLUMN "tb_menu"."date_delete" IS 'fecha de baja';
ALTER TABLE "tb_menu" OWNER TO "postgres";

CREATE TABLE "tb_opcion" (
"id_opcion" serial4 NOT NULL,
"_id_menu" int4,
"nombre" varchar(50),
"link" varchar(150),
"img" varchar(100),
"orden" int4,
"status" bool,
"user_create" int8,
"user_update" int8,
"user_delete" int8,
"date_create" date,
"date_update" date,
"date_delete" date,
CONSTRAINT "tb_opcion_pkey" PRIMARY KEY ("id_opcion") 
)
WITHOUT OIDS;
COMMENT ON COLUMN "tb_opcion"."id_opcion" IS 'pk tabla';
COMMENT ON COLUMN "tb_opcion"."_id_menu" IS 'guarda id de tb_menu';
COMMENT ON COLUMN "tb_opcion"."nombre" IS 'nombres de submenu';
COMMENT ON COLUMN "tb_opcion"."link" IS 'guarda link de acceso';
COMMENT ON COLUMN "tb_opcion"."img" IS 'guarda imagen o icono';
COMMENT ON COLUMN "tb_opcion"."orden" IS 'guarda orden dentro del menu';
COMMENT ON COLUMN "tb_opcion"."status" IS 'estado (true=activo,false=inactivo)';
COMMENT ON COLUMN "tb_opcion"."user_create" IS 'usuario q registra';
COMMENT ON COLUMN "tb_opcion"."user_update" IS 'usuario q modifica';
COMMENT ON COLUMN "tb_opcion"."user_delete" IS 'usuario q da baja';
COMMENT ON COLUMN "tb_opcion"."date_create" IS 'fecha de alta';
COMMENT ON COLUMN "tb_opcion"."date_update" IS 'fecha ultima modificacion';
COMMENT ON COLUMN "tb_opcion"."date_delete" IS 'fecha de baja';
ALTER TABLE "tb_opcion" OWNER TO "postgres";

CREATE TABLE "tb_rol" (
"id_rol" serial4 NOT NULL,
"nombre" varchar(50),
"descripcion" varchar(100),
"_id_modulo" int4,
"status" bool,
"user_create" int8,
"user_update" int8,
"user_delete" int8,
"date_create" date,
"date_update" date,
"date_delete" date,
CONSTRAINT "tb_rol_pkey" PRIMARY KEY ("id_rol") 
)
WITHOUT OIDS;
COMMENT ON COLUMN "tb_rol"."nombre" IS 'guarda nombre rol';
COMMENT ON COLUMN "tb_rol"."descripcion" IS 'guarda descripcio de rol ';
COMMENT ON COLUMN "tb_rol"."_id_modulo" IS 'fk (pk tb_modulo)';
COMMENT ON COLUMN "tb_rol"."status" IS 'Estado, (true=activo, false=inactivo)';
COMMENT ON COLUMN "tb_rol"."user_create" IS 'usuario alta';
COMMENT ON COLUMN "tb_rol"."user_update" IS 'usuario ultima modifica';
COMMENT ON COLUMN "tb_rol"."user_delete" IS 'Usuario baja';
COMMENT ON COLUMN "tb_rol"."date_create" IS 'fecha alta';
COMMENT ON COLUMN "tb_rol"."date_update" IS 'fecha ultima modificacion';
COMMENT ON COLUMN "tb_rol"."date_delete" IS 'fecha baja';
ALTER TABLE "tb_rol" OWNER TO "postgres";

CREATE TABLE "tb_ubicacion_menu" (
"id_ubicacion_menu" serial4 NOT NULL,
"ubicacion" varchar(50),
"status" bool DEFAULT true,
"user_create" int8,
"user_update" int8,
"user_delete" int8,
"date_create" timestamp,
"date_update" timestamp,
"date_delete" timestamp,
CONSTRAINT "tb_ubicacion_menu_pkey" PRIMARY KEY ("id_ubicacion_menu") 
)
WITHOUT OIDS;
COMMENT ON COLUMN "tb_ubicacion_menu"."id_ubicacion_menu" IS 'clave principal';
COMMENT ON COLUMN "tb_ubicacion_menu"."ubicacion" IS 'Ubicacion, (principal, superios, inferios, izq, derecho)';
COMMENT ON COLUMN "tb_ubicacion_menu"."status" IS 'estado(true=vigente, false=no vigente)';
COMMENT ON COLUMN "tb_ubicacion_menu"."user_create" IS 'usuario que da alta';
COMMENT ON COLUMN "tb_ubicacion_menu"."user_update" IS 'usuario de ultima modificacion';
COMMENT ON COLUMN "tb_ubicacion_menu"."user_delete" IS 'usuario q da baja';
COMMENT ON COLUMN "tb_ubicacion_menu"."date_create" IS 'fecha de alta';
COMMENT ON COLUMN "tb_ubicacion_menu"."date_update" IS 'fecha de ultima actualizacion';
COMMENT ON COLUMN "tb_ubicacion_menu"."date_delete" IS 'fecha de baja';
ALTER TABLE "tb_ubicacion_menu" OWNER TO "postgres";

CREATE TABLE "tb_usuario" (
"id_user" serial8 NOT NULL,
"_id_persona" int8,
"alias" varchar(200),
"correo" varchar(50),
"clave" varchar(100),
"clave_tem" varchar(100),
"link" varchar(150),
"status" bool,
"user_create" int8,
"user_update" int8,
"user_delete" int8,
"date_create" date,
"date_update" date,
"date_delete" date,
CONSTRAINT "usuario_pkey" PRIMARY KEY ("id_user") 
)
WITHOUT OIDS;
CREATE INDEX "alias" ON "tb_usuario" USING btree ("alias" ASC NULLS LAST);
COMMENT ON COLUMN "tb_usuario"."id_user" IS 'pk usuario';
COMMENT ON COLUMN "tb_usuario"."_id_persona" IS 'persona vinculada al usuario';
COMMENT ON COLUMN "tb_usuario"."alias" IS 'campo usuado para autenticar';
COMMENT ON COLUMN "tb_usuario"."clave" IS 'guarda clave cifrada';
COMMENT ON COLUMN "tb_usuario"."clave_tem" IS 'clave temporal';
COMMENT ON COLUMN "tb_usuario"."link" IS 'guarda link de acceso';
COMMENT ON COLUMN "tb_usuario"."status" IS '0=desactivado, 1=activado';
COMMENT ON COLUMN "tb_usuario"."user_create" IS 'guarda el usuario que registra';
COMMENT ON COLUMN "tb_usuario"."user_update" IS 'guarda usuario q actualiza';
COMMENT ON COLUMN "tb_usuario"."user_delete" IS 'Usuario que da baja';
COMMENT ON COLUMN "tb_usuario"."date_create" IS 'fecha de alta';
COMMENT ON COLUMN "tb_usuario"."date_update" IS 'fecha ultima actualizacion';
COMMENT ON COLUMN "tb_usuario"."date_delete" IS 'fecha de baja';
ALTER TABLE "tb_usuario" OWNER TO "postgres";

CREATE TABLE "tb_usuario_rol" (
"id_usuario_rol" serial4 NOT NULL,
"_id_rol" int4,
"_id_usuario" int8,
"status" bool DEFAULT true,
"user_create" int8,
"user_update" int8,
"user_delete" int8,
"date_create" date,
"date_update" date,
"date_delete" date,
CONSTRAINT "tb_usuario_rol_pkey" PRIMARY KEY ("id_usuario_rol") 
)
WITHOUT OIDS;
COMMENT ON COLUMN "tb_usuario_rol"."status" IS 'estado';
COMMENT ON COLUMN "tb_usuario_rol"."user_create" IS 'usuario q da alta';
COMMENT ON COLUMN "tb_usuario_rol"."user_update" IS 'usuario ultima actualizacion';
COMMENT ON COLUMN "tb_usuario_rol"."user_delete" IS 'usuario que da baja';
COMMENT ON COLUMN "tb_usuario_rol"."date_create" IS 'fecha de alta';
COMMENT ON COLUMN "tb_usuario_rol"."date_update" IS 'fecha de actualizacion';
COMMENT ON COLUMN "tb_usuario_rol"."date_delete" IS 'fecha de baja';
ALTER TABLE "tb_usuario_rol" OWNER TO "postgres";

CREATE TABLE "tb_modulo" (
"id_modulo" serial4 NOT NULL,
"nombre" text,
"descripcion" text,
"status" bool,
"user_create" int8,
"user_update" int8,
"user_delete" int8,
"date_create" date,
"date_update" date,
"date_delete" date,
PRIMARY KEY ("id_modulo") 
)
WITHOUT OIDS;
COMMENT ON COLUMN "tb_modulo"."id_modulo" IS 'pk tabla';
COMMENT ON COLUMN "tb_modulo"."nombre" IS 'nombre del modulo(financiero,reportes)';
COMMENT ON COLUMN "tb_modulo"."status" IS 'estado (true=activo, false=inactivo)';
COMMENT ON COLUMN "tb_modulo"."user_create" IS 'Usuario Alta';
COMMENT ON COLUMN "tb_modulo"."user_update" IS 'Usuario ultima actualizacion';
COMMENT ON COLUMN "tb_modulo"."user_delete" IS 'usuario baja';
COMMENT ON COLUMN "tb_modulo"."date_create" IS 'fecha alta';
COMMENT ON COLUMN "tb_modulo"."date_update" IS 'fecha ultima actualizacion';
COMMENT ON COLUMN "tb_modulo"."date_delete" IS 'fecha baja';


ALTER TABLE "tb_acceso" ADD CONSTRAINT "fk_tb_accesos_tb_opcion_1" FOREIGN KEY ("_id_opcion") REFERENCES "tb_opcion" ("id_opcion") ON DELETE NO ACTION ON UPDATE NO ACTION;
ALTER TABLE "tb_acceso" ADD CONSTRAINT "fk_tb_accesos_tb_rol_1" FOREIGN KEY ("_id_rol") REFERENCES "tb_rol" ("id_rol") ON DELETE NO ACTION ON UPDATE NO ACTION;
ALTER TABLE "tb_opcion" ADD CONSTRAINT "fk_tb_opcion_tb_menu_1" FOREIGN KEY ("_id_menu") REFERENCES "tb_menu" ("id_menu") ON DELETE NO ACTION ON UPDATE NO ACTION;
ALTER TABLE "tb_usuario_rol" ADD CONSTRAINT "fk_tb_usuario_rol_tb_rol_1" FOREIGN KEY ("_id_rol") REFERENCES "tb_rol" ("id_rol") ON DELETE NO ACTION ON UPDATE NO ACTION;
ALTER TABLE "tb_usuario_rol" ADD CONSTRAINT "fk_tb_usuario_rol_usuario_1" FOREIGN KEY ("_id_usuario") REFERENCES "tb_usuario" ("id_user") ON DELETE NO ACTION ON UPDATE NO ACTION;
ALTER TABLE "tb_menu" ADD CONSTRAINT "fk_tb_menu_tb_ubicacion_menu_1" FOREIGN KEY ("_id_ubicacion_menu") REFERENCES "tb_ubicacion_menu" ("id_ubicacion_menu") ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE "tb_rol" ADD CONSTRAINT "fk_tb_rol_tb_modulo_1" FOREIGN KEY ("_id_modulo") REFERENCES "tb_modulo" ("id_modulo");
