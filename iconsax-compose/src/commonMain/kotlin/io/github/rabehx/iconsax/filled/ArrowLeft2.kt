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

val Iconsax.Filled.ArrowLeft2: ImageVector
    get() {
        if (_ArrowLeft2 != null) {
            return _ArrowLeft2!!
        }
        _ArrowLeft2 = ImageVector.Builder(
            name = "Filled.ArrowLeft2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 2f)
                curveTo(6.48f, 2f, 2f, 6.48f, 2f, 12f)
                curveTo(2f, 17.52f, 6.48f, 22f, 12f, 22f)
                curveTo(17.52f, 22f, 22f, 17.52f, 22f, 12f)
                curveTo(22f, 6.48f, 17.52f, 2f, 12f, 2f)
                close()
                moveTo(15.5f, 12.75f)
                horizontalLineTo(10.31f)
                lineTo(12.03f, 14.47f)
                curveTo(12.32f, 14.76f, 12.32f, 15.24f, 12.03f, 15.53f)
                curveTo(11.88f, 15.68f, 11.69f, 15.75f, 11.5f, 15.75f)
                curveTo(11.31f, 15.75f, 11.12f, 15.68f, 10.97f, 15.53f)
                lineTo(7.97f, 12.53f)
                curveTo(7.68f, 12.24f, 7.68f, 11.76f, 7.97f, 11.47f)
                lineTo(10.97f, 8.47f)
                curveTo(11.26f, 8.18f, 11.74f, 8.18f, 12.03f, 8.47f)
                curveTo(12.32f, 8.76f, 12.32f, 9.24f, 12.03f, 9.53f)
                lineTo(10.31f, 11.25f)
                horizontalLineTo(15.5f)
                curveTo(15.91f, 11.25f, 16.25f, 11.59f, 16.25f, 12f)
                curveTo(16.25f, 12.41f, 15.91f, 12.75f, 15.5f, 12.75f)
                close()
            }
        }.build()

        return _ArrowLeft2!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowLeft2: ImageVector? = null
