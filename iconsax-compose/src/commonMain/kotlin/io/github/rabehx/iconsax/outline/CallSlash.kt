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

val Iconsax.Outline.CallSlash: ImageVector
    get() {
        if (_CallSlash != null) {
            return _CallSlash!!
        }
        _CallSlash = ImageVector.Builder(
            name = "Outline.CallSlash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.45f, 22.75f)
                curveTo(16.32f, 22.75f, 15.13f, 22.48f, 13.9f, 21.96f)
                curveTo(12.7f, 21.45f, 11.49f, 20.75f, 10.31f, 19.9f)
                lineTo(9.87f, 19.57f)
                curveTo(9.54f, 19.32f, 9.48f, 18.85f, 9.73f, 18.52f)
                curveTo(9.98f, 18.19f, 10.45f, 18.13f, 10.78f, 18.38f)
                lineTo(11.2f, 18.69f)
                curveTo(12.28f, 19.48f, 13.39f, 20.12f, 14.49f, 20.58f)
                curveTo(16.2f, 21.31f, 17.8f, 21.48f, 19.12f, 20.93f)
                curveTo(19.63f, 20.72f, 20.08f, 20.4f, 20.49f, 19.94f)
                curveTo(20.72f, 19.69f, 20.9f, 19.42f, 21.05f, 19.1f)
                curveTo(21.17f, 18.85f, 21.23f, 18.59f, 21.23f, 18.33f)
                curveTo(21.23f, 18.17f, 21.2f, 18.01f, 21.12f, 17.83f)
                curveTo(21.1f, 17.78f, 21.03f, 17.66f, 20.84f, 17.53f)
                lineTo(17.52f, 15.17f)
                curveTo(17.32f, 15.03f, 17.14f, 14.93f, 16.97f, 14.86f)
                curveTo(16.71f, 14.76f, 16.54f, 14.75f, 16.32f, 14.89f)
                curveTo(16.12f, 14.99f, 15.94f, 15.14f, 15.74f, 15.34f)
                lineTo(14.98f, 16.09f)
                curveTo(14.59f, 16.47f, 13.99f, 16.56f, 13.53f, 16.39f)
                curveTo(13.51f, 16.38f, 13.41f, 16.34f, 13.39f, 16.33f)
                curveTo(13.38f, 16.32f, 13.27f, 16.28f, 13.26f, 16.27f)
                curveTo(13.04f, 16.16f, 12.8f, 16f, 12.52f, 15.8f)
                curveTo(12.19f, 15.56f, 12.11f, 15.09f, 12.35f, 14.75f)
                curveTo(12.59f, 14.41f, 13.06f, 14.34f, 13.4f, 14.58f)
                curveTo(13.61f, 14.73f, 13.8f, 14.85f, 13.96f, 14.94f)
                lineTo(13.95f, 15f)
                lineTo(14.68f, 14.27f)
                curveTo(14.99f, 13.96f, 15.29f, 13.73f, 15.58f, 13.58f)
                curveTo(16.13f, 13.24f, 16.83f, 13.18f, 17.53f, 13.47f)
                curveTo(17.79f, 13.58f, 18.07f, 13.73f, 18.37f, 13.94f)
                lineTo(21.69f, 16.3f)
                curveTo(22.05f, 16.55f, 22.33f, 16.87f, 22.49f, 17.25f)
                curveTo(22.64f, 17.63f, 22.71f, 17.98f, 22.71f, 18.33f)
                curveTo(22.71f, 18.81f, 22.6f, 19.29f, 22.39f, 19.74f)
                curveTo(22.18f, 20.19f, 21.92f, 20.58f, 21.59f, 20.94f)
                curveTo(21.02f, 21.57f, 20.4f, 22.02f, 19.68f, 22.31f)
                curveTo(18.99f, 22.6f, 18.24f, 22.75f, 17.45f, 22.75f)
                close()
                moveTo(13.95f, 15.01f)
                lineTo(13.79f, 15.69f)
                lineTo(14.06f, 14.99f)
                curveTo(14.02f, 14.98f, 13.97f, 14.99f, 13.95f, 15.01f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(7.47f, 17.24f)
                curveTo(7.28f, 17.24f, 7.08f, 17.17f, 6.94f, 17.02f)
                curveTo(5.89f, 15.96f, 4.92f, 14.83f, 4.08f, 13.66f)
                curveTo(3.22f, 12.46f, 2.53f, 11.27f, 2.04f, 10.1f)
                curveTo(1.51f, 8.87f, 1.25f, 7.67f, 1.25f, 6.54f)
                curveTo(1.25f, 5.76f, 1.39f, 5.02f, 1.66f, 4.33f)
                curveTo(1.95f, 3.61f, 2.39f, 2.96f, 3f, 2.39f)
                curveTo(3.77f, 1.64f, 4.65f, 1.25f, 5.59f, 1.25f)
                curveTo(5.98f, 1.25f, 6.38f, 1.34f, 6.72f, 1.5f)
                curveTo(7.11f, 1.68f, 7.44f, 1.95f, 7.68f, 2.31f)
                lineTo(10f, 5.58f)
                curveTo(10.21f, 5.87f, 10.37f, 6.15f, 10.48f, 6.43f)
                curveTo(10.61f, 6.73f, 10.68f, 7.03f, 10.68f, 7.32f)
                curveTo(10.68f, 7.7f, 10.57f, 8.07f, 10.36f, 8.42f)
                curveTo(10.21f, 8.69f, 9.98f, 8.98f, 9.69f, 9.27f)
                lineTo(9.01f, 9.98f)
                curveTo(9.02f, 10.01f, 9.03f, 10.03f, 9.04f, 10.05f)
                curveTo(9.16f, 10.26f, 9.4f, 10.62f, 9.86f, 11.16f)
                curveTo(10.34f, 11.72f, 10.81f, 12.22f, 11.27f, 12.7f)
                curveTo(11.56f, 13f, 11.56f, 13.47f, 11.26f, 13.76f)
                curveTo(10.96f, 14.05f, 10.49f, 14.05f, 10.2f, 13.75f)
                curveTo(9.71f, 13.25f, 9.23f, 12.72f, 8.72f, 12.13f)
                curveTo(8.25f, 11.58f, 7.91f, 11.11f, 7.7f, 10.72f)
                curveTo(7.68f, 10.68f, 7.66f, 10.64f, 7.65f, 10.6f)
                lineTo(7.58f, 10.43f)
                curveTo(7.52f, 10.21f, 7.5f, 10.08f, 7.5f, 9.94f)
                curveTo(7.5f, 9.58f, 7.63f, 9.26f, 7.88f, 9.01f)
                lineTo(8.63f, 8.23f)
                curveTo(8.83f, 8.03f, 8.98f, 7.84f, 9.08f, 7.67f)
                curveTo(9.16f, 7.54f, 9.19f, 7.43f, 9.19f, 7.33f)
                curveTo(9.19f, 7.25f, 9.16f, 7.13f, 9.11f, 7.01f)
                curveTo(9.03f, 6.82f, 8.92f, 6.65f, 8.78f, 6.45f)
                lineTo(6.46f, 3.17f)
                curveTo(6.36f, 3.03f, 6.24f, 2.93f, 6.09f, 2.86f)
                curveTo(5.94f, 2.79f, 5.77f, 2.75f, 5.59f, 2.75f)
                curveTo(5.04f, 2.75f, 4.53f, 2.99f, 4.04f, 3.47f)
                curveTo(3.59f, 3.9f, 3.26f, 4.37f, 3.06f, 4.88f)
                curveTo(2.85f, 5.4f, 2.75f, 5.95f, 2.75f, 6.54f)
                curveTo(2.75f, 7.47f, 2.97f, 8.48f, 3.41f, 9.52f)
                curveTo(3.86f, 10.58f, 4.49f, 11.68f, 5.29f, 12.78f)
                curveTo(6.09f, 13.88f, 7f, 14.95f, 8f, 15.96f)
                curveTo(8.29f, 16.25f, 8.29f, 16.73f, 8f, 17.02f)
                curveTo(7.85f, 17.17f, 7.66f, 17.24f, 7.47f, 17.24f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(2f, 22.75f)
                curveTo(1.81f, 22.75f, 1.62f, 22.68f, 1.47f, 22.53f)
                curveTo(1.18f, 22.24f, 1.18f, 21.76f, 1.47f, 21.47f)
                lineTo(21.47f, 1.47f)
                curveTo(21.76f, 1.18f, 22.24f, 1.18f, 22.53f, 1.47f)
                curveTo(22.82f, 1.76f, 22.82f, 2.24f, 22.53f, 2.53f)
                lineTo(2.53f, 22.53f)
                curveTo(2.38f, 22.68f, 2.19f, 22.75f, 2f, 22.75f)
                close()
            }
        }.build()

        return _CallSlash!!
    }

@Suppress("ObjectPropertyName")
private var _CallSlash: ImageVector? = null
