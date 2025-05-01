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

val Iconsax.Filled.ArchiveTick: ImageVector
    get() {
        if (_ArchiveTick != null) {
            return _ArchiveTick!!
        }
        _ArchiveTick = ImageVector.Builder(
            name = "Filled.ArchiveTick",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.82f, 1.91f)
                horizontalLineTo(7.18f)
                curveTo(5.06f, 1.91f, 3.32f, 3.65f, 3.32f, 5.77f)
                verticalLineTo(19.86f)
                curveTo(3.32f, 21.66f, 4.61f, 22.42f, 6.19f, 21.55f)
                lineTo(11.07f, 18.84f)
                curveTo(11.59f, 18.55f, 12.43f, 18.55f, 12.94f, 18.84f)
                lineTo(17.82f, 21.55f)
                curveTo(19.4f, 22.43f, 20.69f, 21.67f, 20.69f, 19.86f)
                verticalLineTo(5.77f)
                curveTo(20.68f, 3.65f, 18.95f, 1.91f, 16.82f, 1.91f)
                close()
                moveTo(15.62f, 9.03f)
                lineTo(11.62f, 13.03f)
                curveTo(11.47f, 13.18f, 11.28f, 13.25f, 11.09f, 13.25f)
                curveTo(10.9f, 13.25f, 10.71f, 13.18f, 10.56f, 13.03f)
                lineTo(9.06f, 11.53f)
                curveTo(8.77f, 11.24f, 8.77f, 10.76f, 9.06f, 10.47f)
                curveTo(9.35f, 10.18f, 9.83f, 10.18f, 10.12f, 10.47f)
                lineTo(11.09f, 11.44f)
                lineTo(14.56f, 7.97f)
                curveTo(14.85f, 7.68f, 15.33f, 7.68f, 15.62f, 7.97f)
                curveTo(15.91f, 8.26f, 15.91f, 8.74f, 15.62f, 9.03f)
                close()
            }
        }.build()

        return _ArchiveTick!!
    }

@Suppress("ObjectPropertyName")
private var _ArchiveTick: ImageVector? = null
