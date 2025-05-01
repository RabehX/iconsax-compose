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


val Iconsax.Filled.Stop: ImageVector
    get() {
        if (_Stop != null) {
            return _Stop!!
        }
        _Stop = ImageVector.Builder(
            name = "Filled.Stop",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.36f, 7.78f)
                lineTo(4.54f, 17.28f)
                curveTo(3.93f, 17.65f, 3.11f, 17.28f, 3.03f, 16.57f)
                curveTo(3.01f, 16.38f, 3f, 16.19f, 3f, 16f)
                verticalLineTo(8f)
                curveTo(3f, 5f, 5f, 3f, 8f, 3f)
                horizontalLineTo(16f)
                curveTo(19f, 3f, 20.23f, 4.54f, 20.81f, 6.65f)
                curveTo(20.93f, 7.09f, 20.74f, 7.55f, 20.36f, 7.78f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.999f, 11.09f)
                verticalLineTo(16f)
                curveTo(20.999f, 19f, 18.999f, 21f, 15.999f, 21f)
                horizontalLineTo(7.999f)
                curveTo(7.079f, 21f, 6.209f, 20.75f, 5.469f, 20.31f)
                curveTo(4.829f, 19.94f, 4.869f, 19f, 5.499f, 18.62f)
                lineTo(19.479f, 10.23f)
                curveTo(20.149f, 9.83f, 20.999f, 10.31f, 20.999f, 11.09f)
                close()
            }
        }.build()

        return _Stop!!
    }

@Suppress("ObjectPropertyName")
private var _Stop: ImageVector? = null
