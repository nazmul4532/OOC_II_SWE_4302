public class HttpResponseStatus {
    public enum Code {
        Bad_Request("C_400"),
        Unauthorized("C_401"),
        Forbidden("C_403"),
        NotFound("C_404"),
        Request_Timeout("C_408");


        public final String Label;
        private Code(String Label) {
            this.Label = Label;
        }
        public static Code valueOfLabel(String label) {
            for (Code code : values()) {
                if (code.Label.equals(label)) {
                    return code;
                }
            }
            return null;
        }
    }
}
