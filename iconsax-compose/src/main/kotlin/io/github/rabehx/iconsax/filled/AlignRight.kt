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

val Iconsax.Filled.AlignRight: ImageVector
    get() {
        if (_AlignRight != null) {
            return _AlignRight!!
        }
        _AlignRight = ImageVector.Builder(
            name = "Filled.AlignRight",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4.619f, 15.98f)
                verticalLineTo(17.02f)
                curveTo(4.619f, 18.61f, 5.219f, 19.25f, 6.739f, 19.25f)
                horizontalLineTo(18.619f)
                verticalLineTo(13.75f)
                horizontalLineTo(6.739f)
                curveTo(5.219f, 13.75f, 4.619f, 14.39f, 4.619f, 15.98f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.619f, 7.48f)
                verticalLineTo(8.52f)
                curveTo(9.619f, 10.11f, 10.229f, 10.75f, 11.739f, 10.75f)
                horizontalLineTo(18.619f)
                verticalLineTo(5.25f)
                horizontalLineTo(11.739f)
                curveTo(10.229f, 5.25f, 9.619f, 5.89f, 9.619f, 7.48f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.619f, 22f)
                curveTo(18.209f, 22f, 17.869f, 21.66f, 17.869f, 21.25f)
                verticalLineTo(2.75f)
                curveTo(17.869f, 2.34f, 18.209f, 2f, 18.619f, 2f)
                curveTo(19.029f, 2f, 19.369f, 2.34f, 19.369f, 2.75f)
                verticalLineTo(21.25f)
                curveTo(19.379f, 21.66f, 19.039f, 22f, 18.619f, 22f)
                close()
            }
        }.build()

        return _AlignRight!!
    }

@Suppress("ObjectPropertyName")
private var _AlignRight: ImageVector? = null
