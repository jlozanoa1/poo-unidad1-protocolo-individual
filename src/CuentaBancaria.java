class CuentaBancaria {
    private String numeroCuenta;
    private double saldo;
    private String tipoCuenta;

    // ---------- CONSTRUCTORES ----------
    // 1. Constructor principal.
    public CuentaBancaria(String numeroCuenta, double saldo, String tipoCuenta) {
        if (numeroCuenta.length() != 10) {
            throw new IllegalArgumentException("El número de cuenta debe tener 10 dígitos.");
        }

        if (saldo < 1) {
            throw new IllegalArgumentException("El saldo no puede ser menor que $1.");
        }

        if (tipoCuenta.toLowerCase().equals("credito") || tipoCuenta.toLowerCase().equals("debito")) {
            throw new IllegalArgumentException("El tipo de cuenta debe ser \"credito\" o \"debito\".");
        }
    }

    // 2. Constructor parametrizado con dos parámetros.
    public CuentaBancaria(String numeroCuenta, String tipoCuenta) {
        this(numeroCuenta, 1, tipoCuenta);
    }

    // 3. Constructor sin parámetros con valores por defecto.
    public CuentaBancaria() {
        this("1111111111", 1, "credito");
    }
    // ---------- FIN - CONSTRUCTORES ----------
}
