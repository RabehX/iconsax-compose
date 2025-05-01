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

val Iconsax.Outline.PlayAdd: ImageVector
    get() {
        if (_PlayAdd != null) {
            return _PlayAdd!!
        }
        _PlayAdd = ImageVector.Builder(
            name = "Outline.PlayAdd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 22.75f)
                curveTo(6.07f, 22.75f, 1.25f, 17.93f, 1.25f, 12f)
                curveTo(1.25f, 6.07f, 6.07f, 1.25f, 12f, 1.25f)
                curveTo(17.93f, 1.25f, 22.75f, 6.07f, 22.75f, 12f)
                curveTo(22.75f, 13.4f, 22.49f, 14.74f, 21.97f, 16f)
                curveTo(21.88f, 16.21f, 21.71f, 16.37f, 21.49f, 16.43f)
                curveTo(21.27f, 16.5f, 21.04f, 16.46f, 20.85f, 16.33f)
                curveTo(19.67f, 15.52f, 18.08f, 15.58f, 16.96f, 16.46f)
                curveTo(16.19f, 17.07f, 15.74f, 18f, 15.74f, 18.99f)
                curveTo(15.74f, 19.58f, 15.9f, 20.16f, 16.21f, 20.66f)
                curveTo(16.24f, 20.71f, 16.26f, 20.74f, 16.29f, 20.77f)
                curveTo(16.45f, 20.95f, 16.51f, 21.2f, 16.46f, 21.44f)
                curveTo(16.41f, 21.68f, 16.24f, 21.87f, 16.01f, 21.96f)
                curveTo(14.74f, 22.49f, 13.39f, 22.75f, 12f, 22.75f)
                close()
                moveTo(12f, 2.75f)
                curveTo(6.9f, 2.75f, 2.75f, 6.9f, 2.75f, 12f)
                curveTo(2.75f, 17.1f, 6.9f, 21.25f, 12f, 21.25f)
                curveTo(12.9f, 21.25f, 13.78f, 21.12f, 14.63f, 20.86f)
                curveTo(14.38f, 20.28f, 14.25f, 19.65f, 14.25f, 19f)
                curveTo(14.25f, 17.54f, 14.9f, 16.19f, 16.03f, 15.29f)
                curveTo(17.39f, 14.21f, 19.3f, 13.96f, 20.86f, 14.63f)
                curveTo(21.11f, 13.79f, 21.24f, 12.9f, 21.24f, 11.99f)
                curveTo(21.25f, 6.9f, 17.1f, 2.75f, 12f, 2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.879f, 16.07f)
                curveTo(10.489f, 16.07f, 10.119f, 15.98f, 9.799f, 15.79f)
                curveTo(9.059f, 15.36f, 8.629f, 14.49f, 8.629f, 13.39f)
                verticalLineTo(10.61f)
                curveTo(8.629f, 9.51f, 9.059f, 8.64f, 9.799f, 8.21f)
                curveTo(10.549f, 7.78f, 11.519f, 7.85f, 12.469f, 8.4f)
                lineTo(14.869f, 9.79f)
                curveTo(15.819f, 10.34f, 16.359f, 11.15f, 16.359f, 12f)
                curveTo(16.359f, 12.85f, 15.819f, 13.67f, 14.869f, 14.21f)
                lineTo(12.469f, 15.6f)
                curveTo(11.929f, 15.91f, 11.389f, 16.07f, 10.879f, 16.07f)
                close()
                moveTo(10.889f, 9.43f)
                curveTo(10.759f, 9.43f, 10.649f, 9.46f, 10.549f, 9.51f)
                curveTo(10.279f, 9.67f, 10.129f, 10.07f, 10.129f, 10.61f)
                verticalLineTo(13.39f)
                curveTo(10.129f, 13.93f, 10.279f, 14.34f, 10.549f, 14.49f)
                curveTo(10.819f, 14.64f, 11.239f, 14.58f, 11.719f, 14.3f)
                lineTo(14.119f, 12.91f)
                curveTo(14.589f, 12.64f, 14.859f, 12.3f, 14.859f, 11.99f)
                curveTo(14.859f, 11.68f, 14.589f, 11.35f, 14.119f, 11.07f)
                lineTo(11.719f, 9.68f)
                curveTo(11.409f, 9.52f, 11.129f, 9.43f, 10.889f, 9.43f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19f, 23.75f)
                curveTo(17.34f, 23.75f, 15.78f, 22.87f, 14.94f, 21.44f)
                curveTo(14.49f, 20.72f, 14.25f, 19.87f, 14.25f, 19f)
                curveTo(14.25f, 17.54f, 14.9f, 16.19f, 16.03f, 15.29f)
                curveTo(16.87f, 14.62f, 17.93f, 14.25f, 19f, 14.25f)
                curveTo(21.62f, 14.25f, 23.75f, 16.38f, 23.75f, 19f)
                curveTo(23.75f, 19.87f, 23.51f, 20.72f, 23.06f, 21.45f)
                curveTo(22.81f, 21.87f, 22.49f, 22.25f, 22.11f, 22.57f)
                curveTo(21.28f, 23.33f, 20.17f, 23.75f, 19f, 23.75f)
                close()
                moveTo(19f, 15.75f)
                curveTo(18.26f, 15.75f, 17.56f, 16f, 16.97f, 16.47f)
                curveTo(16.2f, 17.08f, 15.75f, 18.01f, 15.75f, 19f)
                curveTo(15.75f, 19.59f, 15.91f, 20.17f, 16.22f, 20.67f)
                curveTo(16.8f, 21.65f, 17.87f, 22.25f, 19f, 22.25f)
                curveTo(19.79f, 22.25f, 20.55f, 21.96f, 21.13f, 21.44f)
                curveTo(21.39f, 21.22f, 21.61f, 20.96f, 21.77f, 20.68f)
                curveTo(22.09f, 20.17f, 22.25f, 19.59f, 22.25f, 19f)
                curveTo(22.25f, 17.21f, 20.79f, 15.75f, 19f, 15.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.5f, 19.73f)
                horizontalLineTo(17.51f)
                curveTo(17.1f, 19.73f, 16.76f, 19.39f, 16.76f, 18.98f)
                curveTo(16.76f, 18.57f, 17.1f, 18.23f, 17.51f, 18.23f)
                horizontalLineTo(20.5f)
                curveTo(20.91f, 18.23f, 21.25f, 18.57f, 21.25f, 18.98f)
                curveTo(21.25f, 19.39f, 20.91f, 19.73f, 20.5f, 19.73f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19f, 21.26f)
                curveTo(18.59f, 21.26f, 18.25f, 20.92f, 18.25f, 20.51f)
                verticalLineTo(17.52f)
                curveTo(18.25f, 17.11f, 18.59f, 16.77f, 19f, 16.77f)
                curveTo(19.41f, 16.77f, 19.75f, 17.11f, 19.75f, 17.52f)
                verticalLineTo(20.51f)
                curveTo(19.75f, 20.93f, 19.41f, 21.26f, 19f, 21.26f)
                close()
            }
        }.build()

        return _PlayAdd!!
    }

@Suppress("ObjectPropertyName")
private var _PlayAdd: ImageVector? = null
