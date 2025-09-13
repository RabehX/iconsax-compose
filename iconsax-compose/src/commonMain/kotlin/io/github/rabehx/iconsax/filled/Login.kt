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


val Iconsax.Filled.Login: ImageVector
    get() {
        if (_Login != null) {
            return _Login!!
        }
        _Login = ImageVector.Builder(
            name = "Filled.Login",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.758f, 2f)
                curveTo(10.278f, 2f, 9.898f, 2.38f, 9.898f, 2.86f)
                verticalLineTo(11.32f)
                horizontalLineTo(13.568f)
                lineTo(11.998f, 9.75f)
                curveTo(11.708f, 9.46f, 11.708f, 8.98f, 11.998f, 8.69f)
                curveTo(12.288f, 8.4f, 12.768f, 8.4f, 13.058f, 8.69f)
                lineTo(15.898f, 11.54f)
                curveTo(16.188f, 11.83f, 16.188f, 12.31f, 15.898f, 12.6f)
                lineTo(13.058f, 15.45f)
                curveTo(12.908f, 15.6f, 12.718f, 15.67f, 12.528f, 15.67f)
                curveTo(12.338f, 15.67f, 12.148f, 15.6f, 11.998f, 15.45f)
                curveTo(11.708f, 15.16f, 11.708f, 14.68f, 11.998f, 14.39f)
                lineTo(13.558f, 12.83f)
                horizontalLineTo(9.898f)
                verticalLineTo(21.16f)
                curveTo(9.898f, 21.63f, 10.278f, 22.02f, 10.758f, 22.02f)
                curveTo(16.648f, 22.02f, 20.758f, 17.91f, 20.758f, 12.02f)
                curveTo(20.758f, 6.13f, 16.638f, 2f, 10.758f, 2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.988f, 11.32f)
                curveTo(3.578f, 11.32f, 3.238f, 11.66f, 3.238f, 12.07f)
                curveTo(3.238f, 12.48f, 3.578f, 12.82f, 3.988f, 12.82f)
                horizontalLineTo(9.888f)
                verticalLineTo(11.32f)
                horizontalLineTo(3.988f)
                close()
            }
        }.build()

        return _Login!!
    }

@Suppress("ObjectPropertyName")
private var _Login: ImageVector? = null
