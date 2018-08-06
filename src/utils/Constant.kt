package utils


object Constant {

    private val databaseName = "sawan_shop"
    const val tableName = "register_user"
    internal var dbName = "jdbc:postgresql://localhost/$databaseName"
    const val dbDriver = "org.postgresql.Driver"
    const val userName = "postgres"
    const val password = "karun123"
}
