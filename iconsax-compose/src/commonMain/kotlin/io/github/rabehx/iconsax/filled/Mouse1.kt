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


val Iconsax.Filled.Mouse1: ImageVector
    get() {
        if (_Mouse1 != null) {
            return _Mouse1!!
        }
        _Mouse1 = ImageVector.Builder(
            name = "Filled.Mouse1",
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
                moveTo(16.15f, 12.83f)
                lineTo(14.42f, 13.41f)
                curveTo(13.94f, 13.57f, 13.57f, 13.94f, 13.41f, 14.42f)
                lineTo(12.83f, 16.15f)
                curveTo(12.34f, 17.64f, 10.24f, 17.61f, 9.78f, 16.12f)
                lineTo(7.83f, 9.84f)
                curveTo(7.45f, 8.59f, 8.6f, 7.44f, 9.83f, 7.82f)
                lineTo(16.12f, 9.77f)
                curveTo(17.61f, 10.24f, 17.63f, 12.34f, 16.15f, 12.83f)
                close()
            }
        }.build()

        return _Mouse1!!
    }

@Suppress("ObjectPropertyName")
private var _Mouse1: ImageVector? = null
