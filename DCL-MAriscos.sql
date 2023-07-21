private static final String SERVIDOR = "DESKTOP-PV3BIL6";
    private static final String BASE_DATOS = "Mariscos";
    private static final String USUARIO = "anyel";
    private static final String CONTRASENA = "admin";
    
    // URL de conexión
    private static final String URL = "jdbc:sqlserver://" + SERVIDOR + ":1433;database=" + BASE_DATOS + 
            ";user=" + USUARIO + ";password=" + CONTRASENA + ";loginTimeout=30;";
    
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static Statement getStatement() {
        try {
            Connection cn = getConnection();
            if (cn != null) {
                return cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            } else {
                return null;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
    Principal principal = new Principal();
    
    public static void main(String[] args) {
        try (Connection cn = getConnection()) {
            System.out.println("¡Conexión exitosa!");
        } catch (SQLException e) {
            System.out.println("No se pudo establecer la conexión.");
            e.printStackTrace();
        }
    }
	
	
	
	
USE Mariscos;
GRANT CONTROL TO angel;


