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


val Iconsax.Filled.Import3: ImageVector
    get() {
        if (_Import3 != null) {
            return _Import3!!
        }
        _Import3 = ImageVector.Builder(
            name = "Filled.Import3",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(21.14f, 9.898f)
                horizontalLineTo(12.68f)
                verticalLineTo(13.568f)
                lineTo(14.25f, 11.998f)
                curveTo(14.54f, 11.708f, 15.02f, 11.708f, 15.31f, 11.998f)
                curveTo(15.6f, 12.288f, 15.6f, 12.768f, 15.31f, 13.058f)
                lineTo(12.46f, 15.898f)
                curveTo(12.17f, 16.188f, 11.69f, 16.188f, 11.4f, 15.898f)
                lineTo(8.55f, 13.058f)
                curveTo(8.4f, 12.908f, 8.33f, 12.718f, 8.33f, 12.528f)
                curveTo(8.33f, 12.338f, 8.41f, 12.148f, 8.56f, 11.998f)
                curveTo(8.85f, 11.708f, 9.33f, 11.708f, 9.62f, 11.998f)
                lineTo(11.18f, 13.558f)
                verticalLineTo(9.898f)
                horizontalLineTo(2.86f)
                curveTo(2.38f, 9.898f, 2f, 10.278f, 2f, 10.758f)
                curveTo(2f, 16.648f, 6.11f, 20.758f, 12f, 20.758f)
                curveTo(17.89f, 20.758f, 22f, 16.648f, 22f, 10.758f)
                curveTo(22f, 10.278f, 21.62f, 9.898f, 21.14f, 9.898f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.68f, 3.988f)
                curveTo(12.68f, 3.578f, 12.34f, 3.238f, 11.93f, 3.238f)
                curveTo(11.52f, 3.238f, 11.18f, 3.578f, 11.18f, 3.988f)
                verticalLineTo(9.888f)
                horizontalLineTo(12.68f)
                verticalLineTo(3.988f)
                close()
            }
        }.build()

        return _Import3!!
    }

@Suppress("ObjectPropertyName")
private var _Import3: ImageVector? = null
