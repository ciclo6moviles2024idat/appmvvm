package pe.idat.appmvvm.model

sealed class Routes(val path: String) {
    object loginScreen: Routes("loginScreen")
}