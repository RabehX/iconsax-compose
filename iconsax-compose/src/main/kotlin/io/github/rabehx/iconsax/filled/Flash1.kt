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


val Iconsax.Filled.Flash1: ImageVector
    get() {
        if (_Flash1 != null) {
            return _Flash1!!
        }
        _Flash1 = ImageVector.Builder(
            name = "Filled.Flash1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.91f, 10.721f)
                horizontalLineTo(14.821f)
                verticalLineTo(3.521f)
                curveTo(14.821f, 1.841f, 13.91f, 1.501f, 12.8f, 2.761f)
                lineTo(12f, 3.671f)
                lineTo(5.231f, 11.371f)
                curveTo(4.3f, 12.421f, 4.69f, 13.281f, 6.09f, 13.281f)
                horizontalLineTo(9.181f)
                verticalLineTo(20.481f)
                curveTo(9.181f, 22.161f, 10.09f, 22.501f, 11.2f, 21.241f)
                lineTo(12f, 20.331f)
                lineTo(18.771f, 12.631f)
                curveTo(19.701f, 11.581f, 19.31f, 10.721f, 17.91f, 10.721f)
                close()
            }
        }.build()

        return _Flash1!!
    }

@Suppress("ObjectPropertyName")
private var _Flash1: ImageVector? = null
