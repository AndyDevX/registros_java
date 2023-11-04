<!DOCTYPE html> 
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>CALCULADORA FINANCIERA</title>

    <form method="post">
        <label for="operacion">Selecciona una operación:</label>
        <select name="operacion" id="operacion">
           <!-- <option value="interes_simplo">Interés simple</option>
            <option value="interes_compuesto">Interés compuesto</option>
            <option value="anualidades_simples_ciertas_vencidas_inmediatas">Anualidades Simples Ciertas Vencidas Inmediatas</option>
            <option value="anualidades_simples_ciertas_anticipadas_inmediatas">Anualidades Simples Ciertas Anticipadas Inmediatas</option>
            <option value="anualidades_simples_ciertas_vencidas_diferidas">Anualidades Simples Ciertas Vencidas Diferidas</option>
            <option value="anualidades_simples_ciertas_anticipadas_diferidas">Anualidades Simples Ciertas Anticipadas Diferidas</option>
            <option value="amortizacion">Amortización</option>-->
    <?php 
    $opciones=array(
        1=>"interes_simplo",
        2=>"interes_compuesto",
        3=>"interes_compuesto"
    );
    for($i=1;$i<= count($opciones );$i++){
echo"<option value=".$i.">".$opciones[$i]."</option>";
    }
    

    ?>


        </select>

        <div id="formulario">
            <label for="capital">Capital:</label>
            <input type="text" name="num1" id="num1" show ="false"  required>
            <br>
            <b><label for="interes">Interés:</label></b>
            <input type="text" name="num2" id="num2" required>
            <br>
            <label for="tiempo">Tiempo:</label>
            <input type="text" name="num2" id="num2" required>
            <td><b>  </b></td> 
                <label for="lista"></label>
                <td><select id="lista" name="unidad_tiempo">
                <option value="diario"> Dario </option>
                <option value="semanal">Semanal</option>
                <option value="quincenal">Quincenal</option>
                <option value="mensual">Mensual</option>
                <option value="bimestral">Bimestral</option>
                <option value="trimestral">Trimestral</option>
                <option value="cuatrimestral">Cuatrimestral</option>
                <option value="semestral">semestral</option>
                <option value="Septiembre">Septiembre</option>
                <option value="Octubre">Octubre</option>
                <option value="Noviembre">Noviembre</option>
                <option value="Diciembre">Diciembre</option>
                </td> 
                </br>
            
        </div>
        <label for="tiempo">Tiempo:</label>
        <br> 
        <br><input type="submit" value="Calcular"></br>
</br> 
    </form>


</head>
<body>
    
</body>
</html>