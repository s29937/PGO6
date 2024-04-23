class ProgramStudiow {
    private String programName;
    private String programDescription;

    public ProgramStudiow(String programName, String programDescription) {
        this.programName = programName;
        this.programDescription = programDescription;
    }

    public String getProgramName() {
        return programName;
    }

    public String getProgramDescription() {
        return programDescription;
    }
}

enum Status {
    KANDYDAT("Kandydat"),
    STUDENT("Student"),
    ABSOLWENT("Absolwent");

    private final String status;

    Status(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return status;
    }
}