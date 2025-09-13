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

val Iconsax.Outline.CalendarAdd: ImageVector
    get() {
        if (_CalendarAdd != null) {
            return _CalendarAdd!!
        }
        _CalendarAdd = ImageVector.Builder(
            name = "Outline.CalendarAdd",
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
                moveTo(8.5f, 14.5f)
                curveTo(8.37f, 14.5f, 8.24f, 14.48f, 8.12f, 14.42f)
                curveTo(8f, 14.37f, 7.89f, 14.3f, 7.79f, 14.21f)
                curveTo(7.61f, 14.02f, 7.5f, 13.76f, 7.5f, 13.5f)
                curveTo(7.5f, 13.37f, 7.53f, 13.24f, 7.58f, 13.12f)
                curveTo(7.63f, 13f, 7.7f, 12.89f, 7.79f, 12.79f)
                curveTo(7.89f, 12.7f, 8f, 12.63f, 8.12f, 12.58f)
                curveTo(8.48f, 12.43f, 8.93f, 12.51f, 9.21f, 12.79f)
                curveTo(9.3f, 12.89f, 9.37f, 13f, 9.42f, 13.12f)
                curveTo(9.47f, 13.24f, 9.5f, 13.37f, 9.5f, 13.5f)
                curveTo(9.5f, 13.76f, 9.39f, 14.02f, 9.21f, 14.21f)
                curveTo(9.02f, 14.39f, 8.76f, 14.5f, 8.5f, 14.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 14.5f)
                curveTo(11.74f, 14.5f, 11.48f, 14.39f, 11.29f, 14.21f)
                curveTo(11.2f, 14.11f, 11.13f, 14f, 11.08f, 13.88f)
                curveTo(11.03f, 13.76f, 11f, 13.63f, 11f, 13.5f)
                curveTo(11f, 13.24f, 11.11f, 12.98f, 11.29f, 12.79f)
                curveTo(11.57f, 12.51f, 12.01f, 12.42f, 12.38f, 12.58f)
                curveTo(12.5f, 12.63f, 12.61f, 12.7f, 12.71f, 12.79f)
                curveTo(12.89f, 12.98f, 13f, 13.24f, 13f, 13.5f)
                curveTo(13f, 13.63f, 12.98f, 13.76f, 12.92f, 13.88f)
                curveTo(12.87f, 14f, 12.8f, 14.11f, 12.71f, 14.21f)
                curveTo(12.61f, 14.3f, 12.5f, 14.37f, 12.38f, 14.42f)
                curveTo(12.26f, 14.48f, 12.13f, 14.5f, 12f, 14.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.5f, 18f)
                curveTo(8.37f, 18f, 8.24f, 17.97f, 8.12f, 17.92f)
                curveTo(8f, 17.87f, 7.89f, 17.8f, 7.79f, 17.71f)
                curveTo(7.61f, 17.52f, 7.5f, 17.27f, 7.5f, 17f)
                curveTo(7.5f, 16.87f, 7.53f, 16.74f, 7.58f, 16.62f)
                curveTo(7.63f, 16.49f, 7.7f, 16.39f, 7.79f, 16.29f)
                curveTo(7.89f, 16.2f, 8f, 16.13f, 8.12f, 16.08f)
                curveTo(8.48f, 15.92f, 8.93f, 16.01f, 9.21f, 16.29f)
                curveTo(9.3f, 16.39f, 9.37f, 16.49f, 9.42f, 16.62f)
                curveTo(9.47f, 16.74f, 9.5f, 16.87f, 9.5f, 17f)
                curveTo(9.5f, 17.27f, 9.39f, 17.52f, 9.21f, 17.71f)
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
                moveTo(18f, 23.75f)
                curveTo(15.38f, 23.75f, 13.25f, 21.62f, 13.25f, 19f)
                curveTo(13.25f, 16.38f, 15.38f, 14.25f, 18f, 14.25f)
                curveTo(20.62f, 14.25f, 22.75f, 16.38f, 22.75f, 19f)
                curveTo(22.75f, 21.62f, 20.62f, 23.75f, 18f, 23.75f)
                close()
                moveTo(18f, 15.75f)
                curveTo(16.21f, 15.75f, 14.75f, 17.21f, 14.75f, 19f)
                curveTo(14.75f, 20.79f, 16.21f, 22.25f, 18f, 22.25f)
                curveTo(19.79f, 22.25f, 21.25f, 20.79f, 21.25f, 19f)
                curveTo(21.25f, 17.21f, 19.79f, 15.75f, 18f, 15.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.49f, 19.8f)
                horizontalLineTo(16.5f)
                curveTo(16.09f, 19.8f, 15.75f, 19.46f, 15.75f, 19.05f)
                curveTo(15.75f, 18.64f, 16.09f, 18.3f, 16.5f, 18.3f)
                horizontalLineTo(19.49f)
                curveTo(19.9f, 18.3f, 20.24f, 18.64f, 20.24f, 19.05f)
                curveTo(20.24f, 19.46f, 19.91f, 19.8f, 19.49f, 19.8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18f, 21.33f)
                curveTo(17.59f, 21.33f, 17.25f, 20.99f, 17.25f, 20.58f)
                verticalLineTo(17.59f)
                curveTo(17.25f, 17.18f, 17.59f, 16.84f, 18f, 16.84f)
                curveTo(18.41f, 16.84f, 18.75f, 17.18f, 18.75f, 17.59f)
                verticalLineTo(20.58f)
                curveTo(18.75f, 20.99f, 18.41f, 21.33f, 18f, 21.33f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.37f, 22.75f)
                horizontalLineTo(8f)
                curveTo(4.35f, 22.75f, 2.25f, 20.65f, 2.25f, 17f)
                verticalLineTo(8.5f)
                curveTo(2.25f, 4.85f, 4.35f, 2.75f, 8f, 2.75f)
                horizontalLineTo(16f)
                curveTo(19.65f, 2.75f, 21.75f, 4.85f, 21.75f, 8.5f)
                verticalLineTo(16.36f)
                curveTo(21.75f, 16.67f, 21.56f, 16.95f, 21.26f, 17.06f)
                curveTo(20.97f, 17.17f, 20.64f, 17.09f, 20.43f, 16.85f)
                curveTo(19.81f, 16.15f, 18.92f, 15.75f, 17.99f, 15.75f)
                curveTo(16.2f, 15.75f, 14.74f, 17.21f, 14.74f, 19f)
                curveTo(14.74f, 19.59f, 14.9f, 20.17f, 15.21f, 20.67f)
                curveTo(15.38f, 20.97f, 15.6f, 21.22f, 15.84f, 21.43f)
                curveTo(16.08f, 21.63f, 16.17f, 21.96f, 16.06f, 22.26f)
                curveTo(15.97f, 22.55f, 15.69f, 22.75f, 15.37f, 22.75f)
                close()
                moveTo(8f, 4.25f)
                curveTo(5.14f, 4.25f, 3.75f, 5.64f, 3.75f, 8.5f)
                verticalLineTo(17f)
                curveTo(3.75f, 19.86f, 5.14f, 21.25f, 8f, 21.25f)
                horizontalLineTo(13.82f)
                curveTo(13.45f, 20.57f, 13.25f, 19.8f, 13.25f, 19f)
                curveTo(13.25f, 16.38f, 15.38f, 14.25f, 18f, 14.25f)
                curveTo(18.79f, 14.25f, 19.57f, 14.45f, 20.25f, 14.82f)
                verticalLineTo(8.5f)
                curveTo(20.25f, 5.64f, 18.86f, 4.25f, 16f, 4.25f)
                horizontalLineTo(8f)
                close()
            }
        }.build()

        return _CalendarAdd!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarAdd: ImageVector? = null
