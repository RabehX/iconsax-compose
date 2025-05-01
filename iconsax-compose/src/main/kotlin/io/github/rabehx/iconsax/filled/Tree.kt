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


val Iconsax.Filled.Tree: ImageVector
    get() {
        if (_Tree != null) {
            return _Tree!!
        }
        _Tree = ImageVector.Builder(
            name = "Filled.Tree",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.169f, 10.06f)
                horizontalLineTo(7.829f)
                curveTo(6.649f, 10.06f, 6.239f, 9.27f, 6.929f, 8.31f)
                lineTo(11.099f, 2.47f)
                curveTo(11.589f, 1.77f, 12.409f, 1.77f, 12.899f, 2.47f)
                lineTo(17.069f, 8.31f)
                curveTo(17.759f, 9.27f, 17.349f, 10.06f, 16.169f, 10.06f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.59f, 17.999f)
                horizontalLineTo(6.41f)
                curveTo(4.83f, 17.999f, 4.29f, 16.949f, 5.22f, 15.669f)
                lineTo(9.21f, 10.059f)
                horizontalLineTo(14.79f)
                lineTo(18.78f, 15.669f)
                curveTo(19.71f, 16.949f, 19.17f, 17.999f, 17.59f, 17.999f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.75f, 18f)
                verticalLineTo(22f)
                curveTo(12.75f, 22.41f, 12.41f, 22.75f, 12f, 22.75f)
                curveTo(11.59f, 22.75f, 11.25f, 22.41f, 11.25f, 22f)
                verticalLineTo(18f)
                horizontalLineTo(12.75f)
                close()
            }
        }.build()

        return _Tree!!
    }

@Suppress("ObjectPropertyName")
private var _Tree: ImageVector? = null
