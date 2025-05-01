/*
 *
 *  * Copyright (c) 2025, Рабeх Аззам
 *  *
 *  * This file is part of Iconsax Compose.
 *  *
 *  * Iconsax Compose is free software: you can redistribute it and/or modify
 *  * it under the terms of the GNU General Public License as published by
 *  * the Free Software Foundation, either version 3 of the License, or
 *  * (at your option) any later version.
 *  *
 *  * Iconsax Compose is distributed in the hope that it will be useful,
 *  * but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *  * GNU General Public License for more details.
 *  *
 *  * You should have received a copy of the GNU General Public License
 *  * along with Iconsax Compose. If not, see <https://www.gnu.org/licenses/>.
 *
 */

package io.github.rabehx.iconsax.filled


import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax


val Iconsax.Filled.TicketStar: ImageVector
    get() {
        if (_TicketStar != null) {
            return _TicketStar!!
        }
        _TicketStar = ImageVector.Builder(
            name = "Filled.TicketStar",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.649f, 3.859f)
                horizontalLineTo(9.909f)
                verticalLineTo(6.879f)
                curveTo(9.909f, 7.269f, 9.589f, 7.579f, 9.209f, 7.579f)
                curveTo(8.829f, 7.579f, 8.509f, 7.269f, 8.509f, 6.879f)
                verticalLineTo(3.859f)
                horizontalLineTo(7.349f)
                curveTo(3.399f, 3.859f, 2.099f, 5.039f, 2.009f, 8.729f)
                curveTo(1.999f, 8.909f, 2.079f, 9.099f, 2.209f, 9.229f)
                curveTo(2.339f, 9.369f, 2.509f, 9.439f, 2.709f, 9.439f)
                curveTo(4.109f, 9.439f, 5.259f, 10.599f, 5.259f, 11.999f)
                curveTo(5.259f, 13.399f, 4.109f, 14.559f, 2.709f, 14.559f)
                curveTo(2.519f, 14.559f, 2.339f, 14.629f, 2.209f, 14.769f)
                curveTo(2.079f, 14.899f, 1.999f, 15.089f, 2.009f, 15.269f)
                curveTo(2.099f, 18.959f, 3.399f, 20.139f, 7.349f, 20.139f)
                horizontalLineTo(8.509f)
                verticalLineTo(17.119f)
                curveTo(8.509f, 16.729f, 8.829f, 16.419f, 9.209f, 16.419f)
                curveTo(9.589f, 16.419f, 9.909f, 16.729f, 9.909f, 17.119f)
                verticalLineTo(20.139f)
                horizontalLineTo(16.649f)
                curveTo(20.749f, 20.139f, 21.999f, 18.889f, 21.999f, 14.789f)
                verticalLineTo(9.209f)
                curveTo(21.999f, 5.109f, 20.749f, 3.859f, 16.649f, 3.859f)
                close()
                moveTo(18.469f, 11.899f)
                lineTo(17.539f, 12.799f)
                curveTo(17.499f, 12.829f, 17.489f, 12.889f, 17.499f, 12.939f)
                lineTo(17.719f, 14.209f)
                curveTo(17.759f, 14.439f, 17.669f, 14.679f, 17.469f, 14.819f)
                curveTo(17.279f, 14.959f, 17.029f, 14.979f, 16.819f, 14.869f)
                lineTo(15.669f, 14.269f)
                curveTo(15.629f, 14.249f, 15.569f, 14.249f, 15.529f, 14.269f)
                lineTo(14.379f, 14.869f)
                curveTo(14.289f, 14.919f, 14.189f, 14.939f, 14.089f, 14.939f)
                curveTo(13.959f, 14.939f, 13.839f, 14.899f, 13.729f, 14.819f)
                curveTo(13.539f, 14.679f, 13.439f, 14.449f, 13.479f, 14.209f)
                lineTo(13.699f, 12.939f)
                curveTo(13.709f, 12.889f, 13.689f, 12.839f, 13.659f, 12.799f)
                lineTo(12.729f, 11.899f)
                curveTo(12.559f, 11.739f, 12.499f, 11.489f, 12.569f, 11.269f)
                curveTo(12.639f, 11.039f, 12.829f, 10.879f, 13.069f, 10.849f)
                lineTo(14.349f, 10.659f)
                curveTo(14.399f, 10.649f, 14.439f, 10.619f, 14.469f, 10.579f)
                lineTo(15.039f, 9.419f)
                curveTo(15.149f, 9.209f, 15.359f, 9.079f, 15.599f, 9.079f)
                curveTo(15.839f, 9.079f, 16.049f, 9.209f, 16.149f, 9.419f)
                lineTo(16.719f, 10.579f)
                curveTo(16.739f, 10.629f, 16.779f, 10.659f, 16.829f, 10.659f)
                lineTo(18.109f, 10.849f)
                curveTo(18.349f, 10.879f, 18.539f, 11.049f, 18.609f, 11.269f)
                curveTo(18.699f, 11.489f, 18.639f, 11.729f, 18.469f, 11.899f)
                close()
            }
        }.build()

        return _TicketStar!!
    }

@Suppress("ObjectPropertyName")
private var _TicketStar: ImageVector? = null
