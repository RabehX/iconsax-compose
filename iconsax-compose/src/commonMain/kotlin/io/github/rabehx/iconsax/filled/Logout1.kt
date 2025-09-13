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


val Iconsax.Filled.Logout1: ImageVector
    get() {
        if (_Logout1 != null) {
            return _Logout1!!
        }
        _Logout1 = ImageVector.Builder(
            name = "Filled.Logout1",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.878f, 12.07f)
                curveTo(7.878f, 11.66f, 8.218f, 11.32f, 8.628f, 11.32f)
                horizontalLineTo(14.108f)
                verticalLineTo(2.86f)
                curveTo(14.098f, 2.38f, 13.718f, 2f, 13.238f, 2f)
                curveTo(7.348f, 2f, 3.238f, 6.11f, 3.238f, 12f)
                curveTo(3.238f, 17.89f, 7.348f, 22f, 13.238f, 22f)
                curveTo(13.708f, 22f, 14.098f, 21.62f, 14.098f, 21.14f)
                verticalLineTo(12.81f)
                horizontalLineTo(8.628f)
                curveTo(8.208f, 12.82f, 7.878f, 12.48f, 7.878f, 12.07f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.542f, 11.54f)
                lineTo(17.702f, 8.69f)
                curveTo(17.412f, 8.4f, 16.932f, 8.4f, 16.642f, 8.69f)
                curveTo(16.352f, 8.98f, 16.352f, 9.46f, 16.642f, 9.75f)
                lineTo(18.202f, 11.31f)
                horizontalLineTo(14.102f)
                verticalLineTo(12.81f)
                horizontalLineTo(18.192f)
                lineTo(16.632f, 14.37f)
                curveTo(16.342f, 14.66f, 16.342f, 15.14f, 16.632f, 15.43f)
                curveTo(16.782f, 15.58f, 16.972f, 15.65f, 17.162f, 15.65f)
                curveTo(17.352f, 15.65f, 17.542f, 15.58f, 17.692f, 15.43f)
                lineTo(20.532f, 12.58f)
                curveTo(20.832f, 12.3f, 20.832f, 11.83f, 20.542f, 11.54f)
                close()
            }
        }.build()

        return _Logout1!!
    }

@Suppress("ObjectPropertyName")
private var _Logout1: ImageVector? = null
