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

val Iconsax.Outline.CalendarEdit: ImageVector
    get() {
        if (_CalendarEdit != null) {
            return _CalendarEdit!!
        }
        _CalendarEdit = ImageVector.Builder(
            name = "Outline.CalendarEdit",
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
                curveTo(8.37f, 14.5f, 8.24f, 14.47f, 8.12f, 14.42f)
                curveTo(7.99f, 14.37f, 7.89f, 14.3f, 7.79f, 14.21f)
                curveTo(7.61f, 14.02f, 7.5f, 13.76f, 7.5f, 13.5f)
                curveTo(7.5f, 13.24f, 7.61f, 12.98f, 7.79f, 12.79f)
                curveTo(7.89f, 12.7f, 8f, 12.63f, 8.12f, 12.58f)
                curveTo(8.36f, 12.48f, 8.64f, 12.48f, 8.88f, 12.58f)
                curveTo(9f, 12.63f, 9.11f, 12.7f, 9.21f, 12.79f)
                curveTo(9.25f, 12.84f, 9.3f, 12.89f, 9.33f, 12.94f)
                curveTo(9.37f, 13f, 9.4f, 13.06f, 9.42f, 13.12f)
                curveTo(9.45f, 13.18f, 9.47f, 13.24f, 9.48f, 13.3f)
                curveTo(9.49f, 13.37f, 9.5f, 13.44f, 9.5f, 13.5f)
                curveTo(9.5f, 13.76f, 9.39f, 14.02f, 9.21f, 14.21f)
                curveTo(9.11f, 14.3f, 9f, 14.37f, 8.88f, 14.42f)
                curveTo(8.76f, 14.47f, 8.63f, 14.5f, 8.5f, 14.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 14.5f)
                curveTo(11.87f, 14.5f, 11.74f, 14.47f, 11.62f, 14.42f)
                curveTo(11.49f, 14.37f, 11.39f, 14.3f, 11.29f, 14.21f)
                curveTo(11.11f, 14.02f, 11f, 13.76f, 11f, 13.5f)
                curveTo(11f, 13.44f, 11.01f, 13.37f, 11.02f, 13.3f)
                curveTo(11.03f, 13.24f, 11.05f, 13.18f, 11.08f, 13.12f)
                curveTo(11.1f, 13.06f, 11.13f, 13f, 11.17f, 12.94f)
                curveTo(11.21f, 12.89f, 11.25f, 12.84f, 11.29f, 12.79f)
                curveTo(11.66f, 12.42f, 12.33f, 12.42f, 12.71f, 12.79f)
                curveTo(12.75f, 12.84f, 12.79f, 12.89f, 12.83f, 12.94f)
                curveTo(12.87f, 13f, 12.9f, 13.06f, 12.92f, 13.12f)
                curveTo(12.95f, 13.18f, 12.97f, 13.24f, 12.98f, 13.3f)
                curveTo(12.99f, 13.37f, 13f, 13.44f, 13f, 13.5f)
                curveTo(13f, 13.76f, 12.89f, 14.02f, 12.71f, 14.21f)
                curveTo(12.52f, 14.39f, 12.27f, 14.5f, 12f, 14.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.5f, 18f)
                curveTo(8.37f, 18f, 8.24f, 17.97f, 8.12f, 17.92f)
                curveTo(8f, 17.87f, 7.89f, 17.8f, 7.79f, 17.71f)
                curveTo(7.61f, 17.52f, 7.5f, 17.26f, 7.5f, 17f)
                curveTo(7.5f, 16.94f, 7.51f, 16.87f, 7.52f, 16.81f)
                curveTo(7.53f, 16.74f, 7.55f, 16.68f, 7.58f, 16.62f)
                curveTo(7.6f, 16.56f, 7.63f, 16.5f, 7.67f, 16.44f)
                curveTo(7.7f, 16.39f, 7.75f, 16.34f, 7.79f, 16.29f)
                curveTo(7.89f, 16.2f, 8f, 16.13f, 8.12f, 16.08f)
                curveTo(8.36f, 15.98f, 8.64f, 15.98f, 8.88f, 16.08f)
                curveTo(9f, 16.13f, 9.11f, 16.2f, 9.21f, 16.29f)
                curveTo(9.25f, 16.34f, 9.3f, 16.39f, 9.33f, 16.44f)
                curveTo(9.37f, 16.5f, 9.4f, 16.56f, 9.42f, 16.62f)
                curveTo(9.45f, 16.68f, 9.47f, 16.74f, 9.48f, 16.81f)
                curveTo(9.49f, 16.87f, 9.5f, 16.94f, 9.5f, 17f)
                curveTo(9.5f, 17.26f, 9.39f, 17.52f, 9.21f, 17.71f)
                curveTo(9.11f, 17.8f, 9f, 17.87f, 8.88f, 17.92f)
                curveTo(8.76f, 17.97f, 8.63f, 18f, 8.5f, 18f)
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
                moveTo(15.82f, 22.78f)
                curveTo(15.44f, 22.78f, 15.08f, 22.64f, 14.82f, 22.38f)
                curveTo(14.51f, 22.07f, 14.37f, 21.62f, 14.44f, 21.15f)
                lineTo(14.63f, 19.8f)
                curveTo(14.68f, 19.45f, 14.89f, 19.03f, 15.14f, 18.78f)
                lineTo(18.68f, 15.24f)
                curveTo(19.16f, 14.76f, 19.63f, 14.51f, 20.14f, 14.46f)
                curveTo(20.77f, 14.4f, 21.38f, 14.66f, 21.96f, 15.24f)
                curveTo(22.57f, 15.85f, 23.39f, 17.09f, 21.96f, 18.52f)
                lineTo(18.42f, 22.06f)
                curveTo(18.17f, 22.31f, 17.75f, 22.52f, 17.4f, 22.57f)
                lineTo(16.049f, 22.76f)
                curveTo(15.969f, 22.77f, 15.9f, 22.78f, 15.82f, 22.78f)
                close()
                moveTo(20.31f, 15.95f)
                curveTo(20.3f, 15.95f, 20.29f, 15.95f, 20.28f, 15.95f)
                curveTo(20.14f, 15.96f, 19.95f, 16.09f, 19.74f, 16.3f)
                lineTo(16.2f, 19.84f)
                curveTo(16.17f, 19.87f, 16.12f, 19.97f, 16.12f, 20.01f)
                lineTo(15.94f, 21.26f)
                lineTo(17.19f, 21.08f)
                curveTo(17.23f, 21.07f, 17.33f, 21.02f, 17.36f, 20.99f)
                lineTo(20.9f, 17.45f)
                curveTo(21.34f, 17.01f, 21.4f, 16.79f, 20.9f, 16.29f)
                curveTo(20.74f, 16.14f, 20.51f, 15.95f, 20.31f, 15.95f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.921f, 19.25f)
                curveTo(20.851f, 19.25f, 20.781f, 19.24f, 20.721f, 19.22f)
                curveTo(19.401f, 18.85f, 18.351f, 17.8f, 17.981f, 16.48f)
                curveTo(17.871f, 16.08f, 18.101f, 15.67f, 18.501f, 15.55f)
                curveTo(18.901f, 15.44f, 19.311f, 15.67f, 19.431f, 16.07f)
                curveTo(19.661f, 16.89f, 20.311f, 17.54f, 21.131f, 17.77f)
                curveTo(21.531f, 17.88f, 21.761f, 18.3f, 21.651f, 18.7f)
                curveTo(21.551f, 19.03f, 21.251f, 19.25f, 20.921f, 19.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.75f)
                horizontalLineTo(8f)
                curveTo(4.35f, 22.75f, 2.25f, 20.65f, 2.25f, 17f)
                verticalLineTo(8.5f)
                curveTo(2.25f, 4.85f, 4.35f, 2.75f, 8f, 2.75f)
                horizontalLineTo(16f)
                curveTo(19.65f, 2.75f, 21.75f, 4.85f, 21.75f, 8.5f)
                verticalLineTo(12f)
                curveTo(21.75f, 12.41f, 21.41f, 12.75f, 21f, 12.75f)
                curveTo(20.59f, 12.75f, 20.25f, 12.41f, 20.25f, 12f)
                verticalLineTo(8.5f)
                curveTo(20.25f, 5.64f, 18.86f, 4.25f, 16f, 4.25f)
                horizontalLineTo(8f)
                curveTo(5.14f, 4.25f, 3.75f, 5.64f, 3.75f, 8.5f)
                verticalLineTo(17f)
                curveTo(3.75f, 19.86f, 5.14f, 21.25f, 8f, 21.25f)
                horizontalLineTo(12f)
                curveTo(12.41f, 21.25f, 12.75f, 21.59f, 12.75f, 22f)
                curveTo(12.75f, 22.41f, 12.41f, 22.75f, 12f, 22.75f)
                close()
            }
        }.build()

        return _CalendarEdit!!
    }

@Suppress("ObjectPropertyName")
private var _CalendarEdit: ImageVector? = null
