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


val Iconsax.Filled.Check: ImageVector
    get() {
        if (_Check != null) {
            return _Check!!
        }
        _Check = ImageVector.Builder(
            name = "Filled.Check",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15f, 22f)
                curveTo(14.59f, 22f, 14.25f, 21.66f, 14.25f, 21.25f)
                verticalLineTo(2.75f)
                curveTo(14.25f, 2.34f, 14.59f, 2f, 15f, 2f)
                curveTo(15.41f, 2f, 15.75f, 2.34f, 15.75f, 2.75f)
                verticalLineTo(21.25f)
                curveTo(15.75f, 21.66f, 15.41f, 22f, 15f, 22f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 20f)
                horizontalLineTo(15f)
                verticalLineTo(4f)
                horizontalLineTo(18f)
                curveTo(20.21f, 4f, 22f, 5.79f, 22f, 8f)
                verticalLineTo(16f)
                curveTo(22f, 18.21f, 20.21f, 20f, 18f, 20f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6f, 4f)
                curveTo(3.79f, 4f, 2f, 5.79f, 2f, 8f)
                verticalLineTo(16f)
                curveTo(2f, 18.21f, 3.79f, 20f, 6f, 20f)
                horizontalLineTo(11f)
                curveTo(11.55f, 20f, 12f, 19.55f, 12f, 19f)
                verticalLineTo(5f)
                curveTo(12f, 4.45f, 11.55f, 4f, 11f, 4f)
                horizontalLineTo(6f)
                close()
                moveTo(7.75f, 15.5f)
                curveTo(7.75f, 15.91f, 7.41f, 16.25f, 7f, 16.25f)
                curveTo(6.59f, 16.25f, 6.25f, 15.91f, 6.25f, 15.5f)
                verticalLineTo(8.5f)
                curveTo(6.25f, 8.09f, 6.59f, 7.75f, 7f, 7.75f)
                curveTo(7.41f, 7.75f, 7.75f, 8.09f, 7.75f, 8.5f)
                verticalLineTo(15.5f)
                close()
            }
        }.build()

        return _Check!!
    }

@Suppress("ObjectPropertyName")
private var _Check: ImageVector? = null
