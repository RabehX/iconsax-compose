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

package io.github.rabehx.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax

val Iconsax.Outline.House2: ImageVector
    get() {
        if (_House2 != null) {
            return _House2!!
        }
        _House2 = ImageVector.Builder(
            name = "Outline.House2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 22.75f)
                horizontalLineTo(2f)
                curveTo(1.59f, 22.75f, 1.25f, 22.41f, 1.25f, 22f)
                curveTo(1.25f, 21.59f, 1.59f, 21.25f, 2f, 21.25f)
                horizontalLineTo(22f)
                curveTo(22.41f, 21.25f, 22.75f, 21.59f, 22.75f, 22f)
                curveTo(22.75f, 22.41f, 22.41f, 22.75f, 22f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.7f, 22f)
                horizontalLineTo(2.2f)
                lineTo(2.25f, 9.97f)
                curveTo(2.25f, 9.12f, 2.64f, 8.33f, 3.31f, 7.81f)
                lineTo(10.31f, 2.36f)
                curveTo(11.3f, 1.59f, 12.69f, 1.59f, 13.69f, 2.36f)
                lineTo(20.69f, 7.8f)
                curveTo(21.35f, 8.32f, 21.75f, 9.13f, 21.75f, 9.97f)
                verticalLineTo(22f)
                horizontalLineTo(20.25f)
                verticalLineTo(9.98f)
                curveTo(20.25f, 9.6f, 20.07f, 9.23f, 19.77f, 8.99f)
                lineTo(12.77f, 3.55f)
                curveTo(12.32f, 3.2f, 11.69f, 3.2f, 11.23f, 3.55f)
                lineTo(4.23f, 9f)
                curveTo(3.93f, 9.23f, 3.75f, 9.6f, 3.75f, 9.98f)
                lineTo(3.7f, 22f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 22.75f)
                horizontalLineTo(7f)
                curveTo(6.59f, 22.75f, 6.25f, 22.41f, 6.25f, 22f)
                verticalLineTo(12.5f)
                curveTo(6.25f, 11.26f, 7.26f, 10.25f, 8.5f, 10.25f)
                horizontalLineTo(15.5f)
                curveTo(16.74f, 10.25f, 17.75f, 11.26f, 17.75f, 12.5f)
                verticalLineTo(22f)
                curveTo(17.75f, 22.41f, 17.41f, 22.75f, 17f, 22.75f)
                close()
                moveTo(7.75f, 21.25f)
                horizontalLineTo(16.25f)
                verticalLineTo(12.5f)
                curveTo(16.25f, 12.09f, 15.91f, 11.75f, 15.5f, 11.75f)
                horizontalLineTo(8.5f)
                curveTo(8.09f, 11.75f, 7.75f, 12.09f, 7.75f, 12.5f)
                verticalLineTo(21.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10f, 18.5f)
                curveTo(9.59f, 18.5f, 9.25f, 18.16f, 9.25f, 17.75f)
                verticalLineTo(16.25f)
                curveTo(9.25f, 15.84f, 9.59f, 15.5f, 10f, 15.5f)
                curveTo(10.41f, 15.5f, 10.75f, 15.84f, 10.75f, 16.25f)
                verticalLineTo(17.75f)
                curveTo(10.75f, 18.16f, 10.41f, 18.5f, 10f, 18.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.5f, 8.25f)
                horizontalLineTo(10.5f)
                curveTo(10.09f, 8.25f, 9.75f, 7.91f, 9.75f, 7.5f)
                curveTo(9.75f, 7.09f, 10.09f, 6.75f, 10.5f, 6.75f)
                horizontalLineTo(13.5f)
                curveTo(13.91f, 6.75f, 14.25f, 7.09f, 14.25f, 7.5f)
                curveTo(14.25f, 7.91f, 13.91f, 8.25f, 13.5f, 8.25f)
                close()
            }
        }.build()

        return _House2!!
    }

@Suppress("ObjectPropertyName")
private var _House2: ImageVector? = null
