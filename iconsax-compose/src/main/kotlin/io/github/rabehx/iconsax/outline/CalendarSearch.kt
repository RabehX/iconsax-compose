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

val Iconsax.Outline.CalendarSearch: ImageVector
    get() {
        if (_CalendarSearch != null) {
            return _CalendarSearch!!
        }
        _CalendarSearch = ImageVector.Builder(
            name = "Outline.CalendarSearch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8f, 5.75f)
                curveTo(7.59f, 5.75f, 7.25f, 5.41f, 7.25f, 5f)
                verticalLineTo(2f)
                curveTo(7.25f, 1.59f, 7.59f, 1.25f, 8f, 1.25f)
                curveTo(8.41f, 1.25f, 8.75f, 1.59f, 8.75f, 2f)
                verticalLineTo(5f)
                curveTo(8.75f, 5.41f, 8.41f, 5.75f, 8f, 5.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 5.75f)
                curveTo(15.59f, 5.75f, 15.25f, 5.41f, 15.25f, 5f)
                verticalLineTo(2f)
                curveTo(15.25f, 1.59f, 15.59f, 1.25f, 16f, 1.25f)
                curveTo(16.41f, 1.25f, 16.75f, 1.59f, 16.75f, 2f)
                verticalLineTo(5f)
                curveTo(16.75f, 5.41f, 16.41f, 5.75f, 16f, 5.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.2f, 22.15f)
                curveTo(16.02f, 22.15f, 14.25f, 20.38f, 14.25f, 18.2f)
                curveTo(14.25f, 16.02f, 16.02f, 14.25f, 18.2f, 14.25f)
                curveTo(20.38f, 14.25f, 22.15f, 16.02f, 22.15f, 18.2f)
                curveTo(22.15f, 20.38f, 20.38f, 22.15f, 18.2f, 22.15f)
                close()
                moveTo(18.2f, 15.75f)
                curveTo(16.85f, 15.75f, 15.75f, 16.85f, 15.75f, 18.2f)
                curveTo(15.75f, 19.55f, 16.85f, 20.65f, 18.2f, 20.65f)
                curveTo(19.55f, 20.65f, 20.65f, 19.55f, 20.65f, 18.2f)
                curveTo(20.65f, 16.85f, 19.55f, 15.75f, 18.2f, 15.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 22.75f)
                curveTo(21.809f, 22.75f, 21.619f, 22.68f, 21.469f, 22.53f)
                lineTo(20.469f, 21.53f)
                curveTo(20.18f, 21.24f, 20.18f, 20.76f, 20.469f, 20.47f)
                curveTo(20.76f, 20.18f, 21.24f, 20.18f, 21.529f, 20.47f)
                lineTo(22.529f, 21.47f)
                curveTo(22.819f, 21.76f, 22.819f, 22.24f, 22.529f, 22.53f)
                curveTo(22.379f, 22.68f, 22.19f, 22.75f, 22f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.5f, 14.5f)
                curveTo(8.37f, 14.5f, 8.24f, 14.47f, 8.12f, 14.42f)
                curveTo(7.99f, 14.37f, 7.88f, 14.3f, 7.79f, 14.21f)
                curveTo(7.75f, 14.16f, 7.7f, 14.11f, 7.67f, 14.06f)
                curveTo(7.63f, 14f, 7.6f, 13.94f, 7.58f, 13.88f)
                curveTo(7.55f, 13.82f, 7.53f, 13.76f, 7.52f, 13.7f)
                curveTo(7.51f, 13.63f, 7.5f, 13.56f, 7.5f, 13.5f)
                curveTo(7.5f, 13.24f, 7.61f, 12.98f, 7.79f, 12.79f)
                curveTo(7.88f, 12.7f, 7.99f, 12.63f, 8.12f, 12.58f)
                curveTo(8.48f, 12.42f, 8.93f, 12.51f, 9.21f, 12.79f)
                curveTo(9.39f, 12.98f, 9.5f, 13.24f, 9.5f, 13.5f)
                curveTo(9.5f, 13.56f, 9.49f, 13.63f, 9.48f, 13.7f)
                curveTo(9.47f, 13.76f, 9.45f, 13.82f, 9.42f, 13.88f)
                curveTo(9.4f, 13.94f, 9.37f, 14f, 9.33f, 14.06f)
                curveTo(9.29f, 14.11f, 9.25f, 14.16f, 9.21f, 14.21f)
                curveTo(9.02f, 14.39f, 8.76f, 14.5f, 8.5f, 14.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 14.5f)
                curveTo(11.74f, 14.5f, 11.48f, 14.39f, 11.29f, 14.21f)
                curveTo(11.11f, 14.02f, 11f, 13.77f, 11f, 13.5f)
                curveTo(11f, 13.37f, 11.03f, 13.24f, 11.08f, 13.12f)
                curveTo(11.13f, 13f, 11.2f, 12.89f, 11.29f, 12.79f)
                curveTo(11.66f, 12.42f, 12.33f, 12.42f, 12.71f, 12.79f)
                curveTo(12.89f, 12.98f, 13f, 13.24f, 13f, 13.5f)
                curveTo(13f, 13.56f, 12.99f, 13.63f, 12.98f, 13.7f)
                curveTo(12.97f, 13.76f, 12.95f, 13.82f, 12.92f, 13.88f)
                curveTo(12.9f, 13.94f, 12.87f, 14f, 12.83f, 14.06f)
                curveTo(12.79f, 14.11f, 12.75f, 14.16f, 12.71f, 14.21f)
                curveTo(12.52f, 14.39f, 12.26f, 14.5f, 12f, 14.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.5f, 18f)
                curveTo(8.24f, 18f, 7.98f, 17.89f, 7.79f, 17.71f)
                curveTo(7.61f, 17.52f, 7.5f, 17.26f, 7.5f, 17f)
                curveTo(7.5f, 16.87f, 7.53f, 16.74f, 7.58f, 16.62f)
                curveTo(7.63f, 16.49f, 7.7f, 16.38f, 7.79f, 16.29f)
                curveTo(8.16f, 15.92f, 8.84f, 15.92f, 9.21f, 16.29f)
                curveTo(9.39f, 16.48f, 9.5f, 16.74f, 9.5f, 17f)
                curveTo(9.5f, 17.26f, 9.39f, 17.52f, 9.21f, 17.71f)
                curveTo(9.02f, 17.89f, 8.76f, 18f, 8.5f, 18f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.5f, 9.84f)
                horizontalLineTo(3.5f)
                curveTo(3.09f, 9.84f, 2.75f, 9.5f, 2.75f, 9.09f)
                curveTo(2.75f, 8.68f, 3.09f, 8.34f, 3.5f, 8.34f)
                horizontalLineTo(20.5f)
                curveTo(20.91f, 8.34f, 21.25f, 8.68f, 21.25f, 9.09f)
                curveTo(21.25f, 9.5f, 20.91f, 9.84f, 20.5f, 9.84f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.37f, 22.75f)
                horizontalLineTo(8f)
                curveTo(4.35f, 22.75f, 2.25f, 20.65f, 2.25f, 17f)
                verticalLineTo(8.5f)
                curveTo(2.25f, 4.85f, 4.35f, 2.75f, 8f, 2.75f)
                horizontalLineTo(16f)
                curveTo(19.65f, 2.75f, 21.75f, 4.85f, 21.75f, 8.5f)
                verticalLineTo(13f)
                curveTo(21.75f, 13.41f, 21.41f, 13.75f, 21f, 13.75f)
                curveTo(20.59f, 13.75f, 20.25f, 13.41f, 20.25f, 13f)
                verticalLineTo(8.5f)
                curveTo(20.25f, 5.64f, 18.86f, 4.25f, 16f, 4.25f)
                horizontalLineTo(8f)
                curveTo(5.14f, 4.25f, 3.75f, 5.64f, 3.75f, 8.5f)
                verticalLineTo(17f)
                curveTo(3.75f, 19.86f, 5.14f, 21.25f, 8f, 21.25f)
                horizontalLineTo(13.37f)
                curveTo(13.78f, 21.25f, 14.12f, 21.59f, 14.12f, 22f)
                curveTo(14.12f, 22.41f, 13.78f, 22.75f, 13.37f, 22.75f)
                close()
            }
        }.build()

        return _CalendarSearch!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarSearch: ImageVector? = null
