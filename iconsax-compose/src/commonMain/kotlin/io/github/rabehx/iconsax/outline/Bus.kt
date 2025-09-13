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

val Iconsax.Outline.Bus: ImageVector
    get() {
        if (_Bus != null) {
            return _Bus!!
        }
        _Bus = ImageVector.Builder(
            name = "Outline.Bus",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.9f, 22.75f)
                horizontalLineTo(7.1f)
                curveTo(4.98f, 22.75f, 3.25f, 21.02f, 3.25f, 18.9f)
                verticalLineTo(5.1f)
                curveTo(3.25f, 2.98f, 4.98f, 1.25f, 7.1f, 1.25f)
                horizontalLineTo(16.9f)
                curveTo(19.02f, 1.25f, 20.75f, 2.98f, 20.75f, 5.1f)
                verticalLineTo(18.9f)
                curveTo(20.75f, 21.02f, 19.02f, 22.75f, 16.9f, 22.75f)
                close()
                moveTo(7.1f, 2.75f)
                curveTo(5.81f, 2.75f, 4.75f, 3.8f, 4.75f, 5.1f)
                verticalLineTo(18.9f)
                curveTo(4.75f, 20.19f, 5.8f, 21.25f, 7.1f, 21.25f)
                horizontalLineTo(16.9f)
                curveTo(18.19f, 21.25f, 19.25f, 20.2f, 19.25f, 18.9f)
                verticalLineTo(5.1f)
                curveTo(19.25f, 3.81f, 18.2f, 2.75f, 16.9f, 2.75f)
                horizontalLineTo(7.1f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.5f, 13.75f)
                horizontalLineTo(5.5f)
                curveTo(4.26f, 13.75f, 3.25f, 12.74f, 3.25f, 11.5f)
                verticalLineTo(9.5f)
                curveTo(3.25f, 8.26f, 4.26f, 7.25f, 5.5f, 7.25f)
                horizontalLineTo(18.5f)
                curveTo(19.74f, 7.25f, 20.75f, 8.26f, 20.75f, 9.5f)
                verticalLineTo(11.5f)
                curveTo(20.75f, 12.74f, 19.74f, 13.75f, 18.5f, 13.75f)
                close()
                moveTo(5.5f, 8.75f)
                curveTo(5.09f, 8.75f, 4.75f, 9.09f, 4.75f, 9.5f)
                verticalLineTo(11.5f)
                curveTo(4.75f, 11.91f, 5.09f, 12.25f, 5.5f, 12.25f)
                horizontalLineTo(18.5f)
                curveTo(18.91f, 12.25f, 19.25f, 11.91f, 19.25f, 11.5f)
                verticalLineTo(9.5f)
                curveTo(19.25f, 9.09f, 18.91f, 8.75f, 18.5f, 8.75f)
                horizontalLineTo(5.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8f, 18.75f)
                curveTo(7.67f, 18.75f, 7.35f, 18.62f, 7.12f, 18.38f)
                curveTo(7.06f, 18.33f, 7.01f, 18.26f, 6.96f, 18.19f)
                curveTo(6.92f, 18.13f, 6.88f, 18.05f, 6.85f, 17.98f)
                curveTo(6.81f, 17.9f, 6.79f, 17.82f, 6.77f, 17.74f)
                curveTo(6.76f, 17.66f, 6.75f, 17.58f, 6.75f, 17.5f)
                curveTo(6.75f, 17.42f, 6.76f, 17.34f, 6.77f, 17.26f)
                curveTo(6.79f, 17.18f, 6.81f, 17.1f, 6.85f, 17.02f)
                curveTo(6.88f, 16.95f, 6.92f, 16.87f, 6.96f, 16.81f)
                curveTo(7.01f, 16.74f, 7.06f, 16.67f, 7.12f, 16.62f)
                curveTo(7.58f, 16.15f, 8.41f, 16.15f, 8.88f, 16.62f)
                curveTo(8.94f, 16.67f, 8.99f, 16.74f, 9.04f, 16.81f)
                curveTo(9.08f, 16.87f, 9.12f, 16.95f, 9.15f, 17.02f)
                curveTo(9.19f, 17.1f, 9.21f, 17.18f, 9.23f, 17.26f)
                curveTo(9.24f, 17.34f, 9.25f, 17.42f, 9.25f, 17.5f)
                curveTo(9.25f, 17.58f, 9.24f, 17.66f, 9.23f, 17.74f)
                curveTo(9.21f, 17.82f, 9.19f, 17.9f, 9.15f, 17.98f)
                curveTo(9.12f, 18.05f, 9.08f, 18.13f, 9.04f, 18.19f)
                curveTo(8.99f, 18.26f, 8.94f, 18.33f, 8.88f, 18.38f)
                curveTo(8.65f, 18.62f, 8.33f, 18.75f, 8f, 18.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 18.75f)
                curveTo(15.67f, 18.75f, 15.35f, 18.62f, 15.12f, 18.38f)
                curveTo(14.88f, 18.15f, 14.75f, 17.83f, 14.75f, 17.5f)
                curveTo(14.75f, 17.17f, 14.88f, 16.85f, 15.12f, 16.62f)
                curveTo(15.58f, 16.15f, 16.42f, 16.15f, 16.88f, 16.62f)
                curveTo(17.12f, 16.85f, 17.25f, 17.17f, 17.25f, 17.5f)
                curveTo(17.25f, 17.83f, 17.12f, 18.15f, 16.88f, 18.38f)
                curveTo(16.65f, 18.62f, 16.33f, 18.75f, 16f, 18.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.5f, 5.75f)
                horizontalLineTo(9.5f)
                curveTo(9.09f, 5.75f, 8.75f, 5.41f, 8.75f, 5f)
                curveTo(8.75f, 4.59f, 9.09f, 4.25f, 9.5f, 4.25f)
                horizontalLineTo(14.5f)
                curveTo(14.91f, 4.25f, 15.25f, 4.59f, 15.25f, 5f)
                curveTo(15.25f, 5.41f, 14.91f, 5.75f, 14.5f, 5.75f)
                close()
            }
        }.build()

        return _Bus!!
    }

@Suppress("ObjectPropertyName")
private var _Bus: ImageVector? = null
