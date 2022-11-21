public enum Especialidad {
        PEDIATRIA("Pedriatra"),

        TRAUMATOLOGIA("Traumatólogo"),

        DERMATOLOGIA("Dermatólogo"),

        OFTALMOLOGIA("Oftalmólogo");

        private String especialidad;

        Especialidad (String especialidad) {
            this.especialidad = especialidad;
        }

        public String getEspecialidad() {
            return this.especialidad;
        }
    }

