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

val Iconsax.Outline.MessageAdd: ImageVector
    get() {
        if (_MessageAdd != null) {
            return _MessageAdd!!
        }
        _MessageAdd = ImageVector.Builder(
            name = "Outline.MessageAdd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(16f, 22.32f)
                curveTo(15.66f, 22.32f, 15.33f, 22.22f, 15.04f, 22.03f)
                lineTo(10.78f, 19.19f)
                horizontalLineTo(8.89f)
                curveTo(8.66f, 19.19f, 8.44f, 19.08f, 8.3f, 18.9f)
                curveTo(8.16f, 18.71f, 8.11f, 18.47f, 8.17f, 18.25f)
                curveTo(8.23f, 18.01f, 8.26f, 17.77f, 8.26f, 17.51f)
                curveTo(8.26f, 16.71f, 7.96f, 15.94f, 7.42f, 15.34f)
                curveTo(6.81f, 14.65f, 5.94f, 14.26f, 5.01f, 14.26f)
                curveTo(4.12f, 14.26f, 3.29f, 14.61f, 2.68f, 15.24f)
                curveTo(2.49f, 15.44f, 2.2f, 15.52f, 1.94f, 15.44f)
                curveTo(1.68f, 15.36f, 1.47f, 15.15f, 1.41f, 14.88f)
                curveTo(1.31f, 14.44f, 1.26f, 13.96f, 1.26f, 13.44f)
                verticalLineTo(7.44f)
                curveTo(1.26f, 4f, 3.57f, 1.69f, 7.01f, 1.69f)
                horizontalLineTo(17.01f)
                curveTo(20.45f, 1.69f, 22.76f, 4f, 22.76f, 7.44f)
                verticalLineTo(13.44f)
                curveTo(22.76f, 15.11f, 22.21f, 16.55f, 21.16f, 17.6f)
                curveTo(20.28f, 18.48f, 19.11f, 19.01f, 17.76f, 19.15f)
                verticalLineTo(20.57f)
                curveTo(17.76f, 21.22f, 17.4f, 21.81f, 16.83f, 22.12f)
                curveTo(16.56f, 22.25f, 16.28f, 22.32f, 16f, 22.32f)
                close()
                moveTo(9.75f, 17.68f)
                horizontalLineTo(11f)
                curveTo(11.15f, 17.68f, 11.29f, 17.72f, 11.42f, 17.81f)
                lineTo(15.87f, 20.78f)
                curveTo(15.97f, 20.85f, 16.07f, 20.82f, 16.12f, 20.79f)
                curveTo(16.17f, 20.76f, 16.26f, 20.7f, 16.26f, 20.56f)
                verticalLineTo(18.43f)
                curveTo(16.26f, 18.02f, 16.6f, 17.68f, 17.01f, 17.68f)
                curveTo(18.28f, 17.68f, 19.35f, 17.28f, 20.1f, 16.53f)
                curveTo(20.86f, 15.77f, 21.26f, 14.7f, 21.26f, 13.43f)
                verticalLineTo(7.43f)
                curveTo(21.26f, 4.85f, 19.59f, 3.18f, 17.01f, 3.18f)
                horizontalLineTo(7.01f)
                curveTo(4.43f, 3.18f, 2.76f, 4.85f, 2.76f, 7.43f)
                verticalLineTo(13.31f)
                curveTo(3.44f, 12.94f, 4.21f, 12.75f, 5.01f, 12.75f)
                curveTo(6.37f, 12.75f, 7.66f, 13.33f, 8.54f, 14.33f)
                curveTo(9.32f, 15.2f, 9.76f, 16.33f, 9.76f, 17.5f)
                curveTo(9.75f, 17.56f, 9.75f, 17.62f, 9.75f, 17.68f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5f, 22.25f)
                curveTo(3.82f, 22.25f, 2.7f, 21.81f, 1.83f, 21.02f)
                curveTo(1.48f, 20.72f, 1.17f, 20.35f, 0.93f, 19.94f)
                curveTo(0.49f, 19.22f, 0.25f, 18.37f, 0.25f, 17.5f)
                curveTo(0.25f, 16.25f, 0.73f, 15.08f, 1.59f, 14.19f)
                curveTo(2.49f, 13.26f, 3.7f, 12.75f, 5f, 12.75f)
                curveTo(6.36f, 12.75f, 7.65f, 13.33f, 8.53f, 14.33f)
                curveTo(9.31f, 15.2f, 9.75f, 16.33f, 9.75f, 17.5f)
                curveTo(9.75f, 17.88f, 9.7f, 18.26f, 9.6f, 18.62f)
                curveTo(9.5f, 19.07f, 9.31f, 19.54f, 9.05f, 19.95f)
                curveTo(8.22f, 21.37f, 6.66f, 22.25f, 5f, 22.25f)
                close()
                moveTo(5f, 14.25f)
                curveTo(4.11f, 14.25f, 3.28f, 14.6f, 2.67f, 15.23f)
                curveTo(2.08f, 15.84f, 1.75f, 16.64f, 1.75f, 17.5f)
                curveTo(1.75f, 18.09f, 1.91f, 18.67f, 2.22f, 19.17f)
                curveTo(2.38f, 19.45f, 2.59f, 19.7f, 2.83f, 19.91f)
                curveTo(3.43f, 20.46f, 4.2f, 20.76f, 5f, 20.76f)
                curveTo(6.15f, 20.76f, 7.19f, 20.17f, 7.78f, 19.19f)
                curveTo(7.96f, 18.91f, 8.08f, 18.6f, 8.15f, 18.28f)
                curveTo(8.22f, 18.02f, 8.25f, 17.77f, 8.25f, 17.51f)
                curveTo(8.25f, 16.71f, 7.95f, 15.94f, 7.41f, 15.34f)
                curveTo(6.81f, 14.64f, 5.93f, 14.25f, 5f, 14.25f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.49f, 18.23f)
                horizontalLineTo(3.5f)
                curveTo(3.09f, 18.23f, 2.75f, 17.89f, 2.75f, 17.48f)
                curveTo(2.75f, 17.07f, 3.09f, 16.73f, 3.5f, 16.73f)
                horizontalLineTo(6.49f)
                curveTo(6.9f, 16.73f, 7.24f, 17.07f, 7.24f, 17.48f)
                curveTo(7.24f, 17.89f, 6.91f, 18.23f, 6.49f, 18.23f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(5f, 19.76f)
                curveTo(4.59f, 19.76f, 4.25f, 19.42f, 4.25f, 19.01f)
                verticalLineTo(16.02f)
                curveTo(4.25f, 15.61f, 4.59f, 15.27f, 5f, 15.27f)
                curveTo(5.41f, 15.27f, 5.75f, 15.61f, 5.75f, 16.02f)
                verticalLineTo(19.01f)
                curveTo(5.75f, 19.43f, 5.41f, 19.76f, 5f, 19.76f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.5f, 11.25f)
                horizontalLineTo(8.5f)
                curveTo(8.09f, 11.25f, 7.75f, 10.91f, 7.75f, 10.5f)
                curveTo(7.75f, 10.09f, 8.09f, 9.75f, 8.5f, 9.75f)
                horizontalLineTo(15.5f)
                curveTo(15.91f, 9.75f, 16.25f, 10.09f, 16.25f, 10.5f)
                curveTo(16.25f, 10.91f, 15.91f, 11.25f, 15.5f, 11.25f)
                close()
            }
        }.build()

        return _MessageAdd!!
    }

@Suppress("ObjectPropertyName")
private var _MessageAdd: ImageVector? = null
