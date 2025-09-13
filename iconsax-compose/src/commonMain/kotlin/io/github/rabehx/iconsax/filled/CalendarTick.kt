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


val Iconsax.Filled.CalendarTick: ImageVector
    get() {
        if (_CalendarTick != null) {
            return _CalendarTick!!
        }
        _CalendarTick = ImageVector.Builder(
            name = "Filled.CalendarTick",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16.75f, 3.56f)
                verticalLineTo(2f)
                curveTo(16.75f, 1.59f, 16.41f, 1.25f, 16f, 1.25f)
                curveTo(15.59f, 1.25f, 15.25f, 1.59f, 15.25f, 2f)
                verticalLineTo(3.5f)
                horizontalLineTo(8.75f)
                verticalLineTo(2f)
                curveTo(8.75f, 1.59f, 8.41f, 1.25f, 8f, 1.25f)
                curveTo(7.59f, 1.25f, 7.25f, 1.59f, 7.25f, 2f)
                verticalLineTo(3.56f)
                curveTo(4.55f, 3.81f, 3.24f, 5.42f, 3.04f, 7.81f)
                curveTo(3.02f, 8.1f, 3.26f, 8.34f, 3.54f, 8.34f)
                horizontalLineTo(20.46f)
                curveTo(20.75f, 8.34f, 20.99f, 8.09f, 20.96f, 7.81f)
                curveTo(20.76f, 5.42f, 19.45f, 3.81f, 16.75f, 3.56f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19f, 15f)
                curveTo(16.79f, 15f, 15f, 16.79f, 15f, 19f)
                curveTo(15f, 19.75f, 15.21f, 20.46f, 15.58f, 21.06f)
                curveTo(16.27f, 22.22f, 17.54f, 23f, 19f, 23f)
                curveTo(20.46f, 23f, 21.73f, 22.22f, 22.42f, 21.06f)
                curveTo(22.79f, 20.46f, 23f, 19.75f, 23f, 19f)
                curveTo(23f, 16.79f, 21.21f, 15f, 19f, 15f)
                close()
                moveTo(21.07f, 18.57f)
                lineTo(18.94f, 20.54f)
                curveTo(18.8f, 20.67f, 18.61f, 20.74f, 18.43f, 20.74f)
                curveTo(18.24f, 20.74f, 18.05f, 20.67f, 17.9f, 20.52f)
                lineTo(16.91f, 19.53f)
                curveTo(16.62f, 19.24f, 16.62f, 18.76f, 16.91f, 18.47f)
                curveTo(17.2f, 18.18f, 17.68f, 18.18f, 17.97f, 18.47f)
                lineTo(18.45f, 18.95f)
                lineTo(20.05f, 17.47f)
                curveTo(20.35f, 17.19f, 20.83f, 17.21f, 21.11f, 17.51f)
                curveTo(21.39f, 17.81f, 21.37f, 18.28f, 21.07f, 18.57f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20f, 9.84f)
                horizontalLineTo(4f)
                curveTo(3.45f, 9.84f, 3f, 10.29f, 3f, 10.84f)
                verticalLineTo(17f)
                curveTo(3f, 20f, 4.5f, 22f, 8f, 22f)
                horizontalLineTo(12.93f)
                curveTo(13.62f, 22f, 14.1f, 21.33f, 13.88f, 20.68f)
                curveTo(13.68f, 20.1f, 13.51f, 19.46f, 13.51f, 19f)
                curveTo(13.51f, 15.97f, 15.98f, 13.5f, 19.01f, 13.5f)
                curveTo(19.3f, 13.5f, 19.59f, 13.52f, 19.87f, 13.57f)
                curveTo(20.47f, 13.66f, 21.01f, 13.19f, 21.01f, 12.59f)
                verticalLineTo(10.85f)
                curveTo(21f, 10.29f, 20.55f, 9.84f, 20f, 9.84f)
                close()
                moveTo(9.21f, 18.21f)
                curveTo(9.02f, 18.39f, 8.76f, 18.5f, 8.5f, 18.5f)
                curveTo(8.24f, 18.5f, 7.98f, 18.39f, 7.79f, 18.21f)
                curveTo(7.61f, 18.02f, 7.5f, 17.76f, 7.5f, 17.5f)
                curveTo(7.5f, 17.24f, 7.61f, 16.98f, 7.79f, 16.79f)
                curveTo(7.89f, 16.7f, 7.99f, 16.63f, 8.12f, 16.58f)
                curveTo(8.49f, 16.42f, 8.93f, 16.51f, 9.21f, 16.79f)
                curveTo(9.39f, 16.98f, 9.5f, 17.24f, 9.5f, 17.5f)
                curveTo(9.5f, 17.76f, 9.39f, 18.02f, 9.21f, 18.21f)
                close()
                moveTo(9.21f, 14.71f)
                curveTo(9.16f, 14.75f, 9.11f, 14.79f, 9.06f, 14.83f)
                curveTo(9f, 14.87f, 8.94f, 14.9f, 8.88f, 14.92f)
                curveTo(8.82f, 14.95f, 8.76f, 14.97f, 8.7f, 14.98f)
                curveTo(8.63f, 14.99f, 8.56f, 15f, 8.5f, 15f)
                curveTo(8.24f, 15f, 7.98f, 14.89f, 7.79f, 14.71f)
                curveTo(7.61f, 14.52f, 7.5f, 14.26f, 7.5f, 14f)
                curveTo(7.5f, 13.74f, 7.61f, 13.48f, 7.79f, 13.29f)
                curveTo(8.02f, 13.06f, 8.37f, 12.95f, 8.7f, 13.02f)
                curveTo(8.76f, 13.03f, 8.82f, 13.05f, 8.88f, 13.08f)
                curveTo(8.94f, 13.1f, 9f, 13.13f, 9.06f, 13.17f)
                curveTo(9.11f, 13.21f, 9.16f, 13.25f, 9.21f, 13.29f)
                curveTo(9.39f, 13.48f, 9.5f, 13.74f, 9.5f, 14f)
                curveTo(9.5f, 14.26f, 9.39f, 14.52f, 9.21f, 14.71f)
                close()
                moveTo(12.71f, 14.71f)
                curveTo(12.52f, 14.89f, 12.26f, 15f, 12f, 15f)
                curveTo(11.74f, 15f, 11.48f, 14.89f, 11.29f, 14.71f)
                curveTo(11.11f, 14.52f, 11f, 14.26f, 11f, 14f)
                curveTo(11f, 13.74f, 11.11f, 13.48f, 11.29f, 13.29f)
                curveTo(11.67f, 12.92f, 12.34f, 12.92f, 12.71f, 13.29f)
                curveTo(12.89f, 13.48f, 13f, 13.74f, 13f, 14f)
                curveTo(13f, 14.26f, 12.89f, 14.52f, 12.71f, 14.71f)
                close()
            }
        }.build()

        return _CalendarTick!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarTick: ImageVector? = null
