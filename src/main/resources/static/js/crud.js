/* Función para cargar la imagen seleccionada del empleado */
function mostrarImagenEmpleado(input) {
    if (input.files && input.files[0]) {
        var reader = new FileReader();
        reader.onload = function (e) {
            $('#imagenEmpleado').attr('src', e.target.result).height(200);
        };
        reader.readAsDataURL(input.files[0]);
    }
}

/* Función para agregar un empleado */
function agregarEmpleado(formulario) {
    var nombreEmpleado = formulario.elements['nombreEmpleado'].value;
    var cargoEmpleado = formulario.elements['cargoEmpleado'].value;
    var hotelId = formulario.elements['hotelId'].value;
    var url = '/api/empleados/agregar';
    var datosEmpleado = {
        "nombre": nombreEmpleado,
        "cargo": cargoEmpleado,
        "hotelId": hotelId
    };
    $.ajax({
        type: "POST",
        url: url,
        contentType: "application/json",
        data: JSON.stringify(datosEmpleado),
        success: function (response) {
            console.log("Empleado agregado exitosamente:", response);
            // Actualizar la vista o realizar alguna otra acción después de agregar el empleado
        },
        error: function (xhr, status, error) {
            console.error("Error al agregar empleado:", error);
        }
    });
}

/* Función para cargar la imagen seleccionada del hotel */
function mostrarImagenHotel(input) {
    if (input.files && input.files[0]) {
        var reader = new FileReader();
        reader.onload = function (e) {
            $('#imagenHotel').attr('src', e.target.result).height(200);
        };
        reader.readAsDataURL(input.files[0]);
    }
}

/* Función para agregar un hotel */
function agregarHotel(formulario) {
    var nombreHotel = formulario.elements['nombreHotel'].value;
    var ubicacionHotel = formulario.elements['ubicacionHotel'].value;
    var descripcionHotel = formulario.elements['descripcionHotel'].value;
    var url = '/api/hoteles/agregar';
    var datosHotel = {
        "nombre": nombreHotel,
        "ubicacion": ubicacionHotel,
        "descripcion": descripcionHotel
    };
    $.ajax({
        type: "POST",
        url: url,
        contentType: "application/json",
        data: JSON.stringify(datosHotel),
        success: function (response) {
            console.log("Hotel agregado exitosamente:", response);
            // Actualizar la vista o realizar alguna otra acción después de agregar el hotel
        },
        error: function (xhr, status, error) {
            console.error("Error al agregar hotel:", error);
        }
    });
}
