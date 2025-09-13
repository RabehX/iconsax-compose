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

val Iconsax.Outline.Sun: ImageVector
    get() {
        if (_Sun != null) {
            return _Sun!!
        }
        _Sun = ImageVector.Builder(
            name = "Outline.Sun",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 9.25f)
                curveTo(11.59f, 9.25f, 11.25f, 8.91f, 11.25f, 8.5f)
                verticalLineTo(3f)
                curveTo(11.25f, 2.59f, 11.59f, 2.25f, 12f, 2.25f)
                curveTo(12.41f, 2.25f, 12.75f, 2.59f, 12.75f, 3f)
                verticalLineTo(8.5f)
                curveTo(12.75f, 8.91f, 12.41f, 9.25f, 12f, 9.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 21.75f)
                curveTo(11.59f, 21.75f, 11.25f, 21.41f, 11.25f, 21f)
                verticalLineTo(15.5f)
                curveTo(11.25f, 15.09f, 11.59f, 14.75f, 12f, 14.75f)
                curveTo(12.41f, 14.75f, 12.75f, 15.09f, 12.75f, 15.5f)
                verticalLineTo(21f)
                curveTo(12.75f, 21.41f, 12.41f, 21.75f, 12f, 21.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14f, 3.75f)
                horizontalLineTo(10f)
                curveTo(9.59f, 3.75f, 9.25f, 3.41f, 9.25f, 3f)
                curveTo(9.25f, 2.59f, 9.59f, 2.25f, 10f, 2.25f)
                horizontalLineTo(14f)
                curveTo(14.41f, 2.25f, 14.75f, 2.59f, 14.75f, 3f)
                curveTo(14.75f, 3.41f, 14.41f, 3.75f, 14f, 3.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14f, 21.75f)
                horizontalLineTo(10f)
                curveTo(9.59f, 21.75f, 9.25f, 21.41f, 9.25f, 21f)
                curveTo(9.25f, 20.59f, 9.59f, 20.25f, 10f, 20.25f)
                horizontalLineTo(14f)
                curveTo(14.41f, 20.25f, 14.75f, 20.59f, 14.75f, 21f)
                curveTo(14.75f, 21.41f, 14.41f, 21.75f, 14f, 21.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.97f, 11f)
                curveTo(8.84f, 11f, 8.71f, 10.97f, 8.6f, 10.9f)
                lineTo(3.84f, 8.15f)
                curveTo(3.48f, 7.94f, 3.36f, 7.48f, 3.57f, 7.13f)
                curveTo(3.78f, 6.77f, 4.24f, 6.65f, 4.59f, 6.86f)
                lineTo(9.35f, 9.61f)
                curveTo(9.71f, 9.82f, 9.83f, 10.28f, 9.62f, 10.63f)
                curveTo(9.48f, 10.87f, 9.23f, 11f, 8.97f, 11f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.79f, 17.25f)
                curveTo(19.66f, 17.25f, 19.53f, 17.22f, 19.42f, 17.15f)
                lineTo(14.66f, 14.4f)
                curveTo(14.3f, 14.19f, 14.18f, 13.73f, 14.39f, 13.38f)
                curveTo(14.6f, 13.02f, 15.06f, 12.9f, 15.41f, 13.11f)
                lineTo(20.17f, 15.86f)
                curveTo(20.53f, 16.07f, 20.65f, 16.53f, 20.44f, 16.88f)
                curveTo(20.3f, 17.12f, 20.05f, 17.25f, 19.79f, 17.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.21f, 9.98f)
                curveTo(3.08f, 9.98f, 2.95f, 9.95f, 2.84f, 9.88f)
                curveTo(2.48f, 9.67f, 2.36f, 9.21f, 2.57f, 8.86f)
                lineTo(4.57f, 5.4f)
                curveTo(4.78f, 5.04f, 5.24f, 4.92f, 5.59f, 5.13f)
                curveTo(5.95f, 5.34f, 6.07f, 5.8f, 5.86f, 6.15f)
                lineTo(3.86f, 9.61f)
                curveTo(3.72f, 9.85f, 3.46f, 9.98f, 3.21f, 9.98f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.79f, 18.98f)
                curveTo(18.66f, 18.98f, 18.53f, 18.95f, 18.42f, 18.88f)
                curveTo(18.06f, 18.67f, 17.94f, 18.21f, 18.15f, 17.86f)
                lineTo(20.15f, 14.4f)
                curveTo(20.36f, 14.04f, 20.82f, 13.92f, 21.17f, 14.13f)
                curveTo(21.53f, 14.34f, 21.65f, 14.8f, 21.44f, 15.15f)
                lineTo(19.44f, 18.61f)
                curveTo(19.31f, 18.85f, 19.05f, 18.98f, 18.79f, 18.98f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 16.25f)
                curveTo(10.49f, 16.25f, 9.08f, 15.44f, 8.32f, 14.13f)
                curveTo(7.94f, 13.47f, 7.75f, 12.76f, 7.75f, 12f)
                curveTo(7.75f, 11.24f, 7.94f, 10.53f, 8.32f, 9.88f)
                curveTo(9.08f, 8.57f, 10.49f, 7.76f, 12f, 7.76f)
                curveTo(13.51f, 7.76f, 14.92f, 8.57f, 15.68f, 9.88f)
                curveTo(16.06f, 10.54f, 16.25f, 11.25f, 16.25f, 12.01f)
                curveTo(16.25f, 12.77f, 16.06f, 13.48f, 15.68f, 14.13f)
                curveTo(14.92f, 15.44f, 13.51f, 16.25f, 12f, 16.25f)
                close()
                moveTo(12f, 9.25f)
                curveTo(11.02f, 9.25f, 10.11f, 9.78f, 9.62f, 10.63f)
                curveTo(9.38f, 11.05f, 9.25f, 11.52f, 9.25f, 12f)
                curveTo(9.25f, 12.48f, 9.37f, 12.95f, 9.62f, 13.38f)
                curveTo(10.11f, 14.23f, 11.02f, 14.76f, 12f, 14.76f)
                curveTo(12.98f, 14.76f, 13.89f, 14.23f, 14.38f, 13.38f)
                curveTo(14.62f, 12.96f, 14.75f, 12.49f, 14.75f, 12.01f)
                curveTo(14.75f, 11.53f, 14.63f, 11.06f, 14.38f, 10.63f)
                curveTo(13.89f, 9.78f, 12.98f, 9.25f, 12f, 9.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.03f, 11f)
                curveTo(14.77f, 11f, 14.52f, 10.87f, 14.38f, 10.62f)
                curveTo(14.17f, 10.26f, 14.3f, 9.8f, 14.65f, 9.6f)
                lineTo(19.41f, 6.85f)
                curveTo(19.77f, 6.64f, 20.23f, 6.77f, 20.43f, 7.12f)
                curveTo(20.64f, 7.48f, 20.51f, 7.94f, 20.16f, 8.14f)
                lineTo(15.4f, 10.89f)
                curveTo(15.29f, 10.97f, 15.16f, 11f, 15.03f, 11f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4.21f, 17.25f)
                curveTo(3.95f, 17.25f, 3.7f, 17.12f, 3.56f, 16.87f)
                curveTo(3.35f, 16.51f, 3.48f, 16.05f, 3.83f, 15.85f)
                lineTo(8.59f, 13.1f)
                curveTo(8.95f, 12.89f, 9.41f, 13.02f, 9.61f, 13.37f)
                curveTo(9.82f, 13.73f, 9.69f, 14.19f, 9.34f, 14.39f)
                lineTo(4.58f, 17.14f)
                curveTo(4.47f, 17.22f, 4.34f, 17.25f, 4.21f, 17.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.79f, 9.98f)
                curveTo(20.53f, 9.98f, 20.28f, 9.85f, 20.14f, 9.6f)
                lineTo(18.14f, 6.14f)
                curveTo(17.93f, 5.78f, 18.06f, 5.32f, 18.41f, 5.12f)
                curveTo(18.77f, 4.91f, 19.23f, 5.04f, 19.43f, 5.39f)
                lineTo(21.43f, 8.85f)
                curveTo(21.64f, 9.21f, 21.51f, 9.67f, 21.16f, 9.87f)
                curveTo(21.05f, 9.95f, 20.92f, 9.98f, 20.79f, 9.98f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5.21f, 18.98f)
                curveTo(4.95f, 18.98f, 4.7f, 18.85f, 4.56f, 18.6f)
                lineTo(2.56f, 15.14f)
                curveTo(2.35f, 14.78f, 2.48f, 14.32f, 2.83f, 14.12f)
                curveTo(3.19f, 13.91f, 3.65f, 14.04f, 3.85f, 14.39f)
                lineTo(5.85f, 17.85f)
                curveTo(6.06f, 18.21f, 5.93f, 18.67f, 5.58f, 18.87f)
                curveTo(5.46f, 18.95f, 5.33f, 18.98f, 5.21f, 18.98f)
                close()
            }
        }.build()

        return _Sun!!
    }

@Suppress("ObjectPropertyName")
private var _Sun: ImageVector? = null
