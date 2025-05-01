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

val Iconsax.Outline.Setting2: ImageVector
    get() {
        if (_Setting2 != null) {
            return _Setting2!!
        }
        _Setting2 = ImageVector.Builder(
            name = "Outline.Setting2",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 15.75f)
                curveTo(9.93f, 15.75f, 8.25f, 14.07f, 8.25f, 12f)
                curveTo(8.25f, 9.93f, 9.93f, 8.25f, 12f, 8.25f)
                curveTo(14.07f, 8.25f, 15.75f, 9.93f, 15.75f, 12f)
                curveTo(15.75f, 14.07f, 14.07f, 15.75f, 12f, 15.75f)
                close()
                moveTo(12f, 9.75f)
                curveTo(10.76f, 9.75f, 9.75f, 10.76f, 9.75f, 12f)
                curveTo(9.75f, 13.24f, 10.76f, 14.25f, 12f, 14.25f)
                curveTo(13.24f, 14.25f, 14.25f, 13.24f, 14.25f, 12f)
                curveTo(14.25f, 10.76f, 13.24f, 9.75f, 12f, 9.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.21f, 22.19f)
                curveTo(15f, 22.19f, 14.79f, 22.16f, 14.58f, 22.11f)
                curveTo(13.96f, 21.94f, 13.44f, 21.55f, 13.11f, 21f)
                lineTo(12.99f, 20.8f)
                curveTo(12.4f, 19.78f, 11.59f, 19.78f, 11f, 20.8f)
                lineTo(10.89f, 20.99f)
                curveTo(10.56f, 21.55f, 10.04f, 21.95f, 9.42f, 22.11f)
                curveTo(8.79f, 22.28f, 8.14f, 22.19f, 7.59f, 21.86f)
                lineTo(5.87f, 20.87f)
                curveTo(5.26f, 20.52f, 4.82f, 19.95f, 4.63f, 19.26f)
                curveTo(4.45f, 18.57f, 4.54f, 17.86f, 4.89f, 17.25f)
                curveTo(5.18f, 16.74f, 5.26f, 16.28f, 5.09f, 15.99f)
                curveTo(4.92f, 15.7f, 4.49f, 15.53f, 3.9f, 15.53f)
                curveTo(2.44f, 15.53f, 1.25f, 14.34f, 1.25f, 12.88f)
                verticalLineTo(11.12f)
                curveTo(1.25f, 9.66f, 2.44f, 8.47f, 3.9f, 8.47f)
                curveTo(4.49f, 8.47f, 4.92f, 8.3f, 5.09f, 8.01f)
                curveTo(5.26f, 7.72f, 5.19f, 7.26f, 4.89f, 6.75f)
                curveTo(4.54f, 6.14f, 4.45f, 5.42f, 4.63f, 4.74f)
                curveTo(4.81f, 4.05f, 5.25f, 3.48f, 5.87f, 3.13f)
                lineTo(7.6f, 2.14f)
                curveTo(8.73f, 1.47f, 10.22f, 1.86f, 10.9f, 3.01f)
                lineTo(11.02f, 3.21f)
                curveTo(11.61f, 4.23f, 12.42f, 4.23f, 13.01f, 3.21f)
                lineTo(13.12f, 3.02f)
                curveTo(13.8f, 1.86f, 15.29f, 1.47f, 16.43f, 2.15f)
                lineTo(18.15f, 3.14f)
                curveTo(18.76f, 3.49f, 19.2f, 4.06f, 19.39f, 4.75f)
                curveTo(19.57f, 5.44f, 19.48f, 6.15f, 19.13f, 6.76f)
                curveTo(18.84f, 7.27f, 18.76f, 7.73f, 18.93f, 8.02f)
                curveTo(19.1f, 8.31f, 19.53f, 8.48f, 20.12f, 8.48f)
                curveTo(21.58f, 8.48f, 22.77f, 9.67f, 22.77f, 11.13f)
                verticalLineTo(12.89f)
                curveTo(22.77f, 14.35f, 21.58f, 15.54f, 20.12f, 15.54f)
                curveTo(19.53f, 15.54f, 19.1f, 15.71f, 18.93f, 16f)
                curveTo(18.76f, 16.29f, 18.83f, 16.75f, 19.13f, 17.26f)
                curveTo(19.48f, 17.87f, 19.58f, 18.59f, 19.39f, 19.27f)
                curveTo(19.21f, 19.96f, 18.77f, 20.53f, 18.15f, 20.88f)
                lineTo(16.42f, 21.87f)
                curveTo(16.04f, 22.08f, 15.63f, 22.19f, 15.21f, 22.19f)
                close()
                moveTo(12f, 18.49f)
                curveTo(12.89f, 18.49f, 13.72f, 19.05f, 14.29f, 20.04f)
                lineTo(14.4f, 20.23f)
                curveTo(14.52f, 20.44f, 14.72f, 20.59f, 14.96f, 20.65f)
                curveTo(15.2f, 20.71f, 15.44f, 20.68f, 15.64f, 20.56f)
                lineTo(17.37f, 19.56f)
                curveTo(17.63f, 19.41f, 17.83f, 19.16f, 17.91f, 18.86f)
                curveTo(17.99f, 18.56f, 17.95f, 18.25f, 17.8f, 17.99f)
                curveTo(17.23f, 17.01f, 17.16f, 16f, 17.6f, 15.23f)
                curveTo(18.04f, 14.46f, 18.95f, 14.02f, 20.09f, 14.02f)
                curveTo(20.73f, 14.02f, 21.24f, 13.51f, 21.24f, 12.87f)
                verticalLineTo(11.11f)
                curveTo(21.24f, 10.48f, 20.73f, 9.96f, 20.09f, 9.96f)
                curveTo(18.95f, 9.96f, 18.04f, 9.52f, 17.6f, 8.75f)
                curveTo(17.16f, 7.98f, 17.23f, 6.97f, 17.8f, 5.99f)
                curveTo(17.95f, 5.73f, 17.99f, 5.42f, 17.91f, 5.12f)
                curveTo(17.83f, 4.82f, 17.64f, 4.58f, 17.38f, 4.42f)
                lineTo(15.65f, 3.43f)
                curveTo(15.22f, 3.17f, 14.65f, 3.32f, 14.39f, 3.76f)
                lineTo(14.28f, 3.95f)
                curveTo(13.71f, 4.94f, 12.88f, 5.5f, 11.99f, 5.5f)
                curveTo(11.1f, 5.5f, 10.27f, 4.94f, 9.7f, 3.95f)
                lineTo(9.59f, 3.75f)
                curveTo(9.34f, 3.33f, 8.78f, 3.18f, 8.35f, 3.43f)
                lineTo(6.62f, 4.43f)
                curveTo(6.36f, 4.58f, 6.16f, 4.83f, 6.08f, 5.13f)
                curveTo(6f, 5.43f, 6.04f, 5.74f, 6.19f, 6f)
                curveTo(6.76f, 6.98f, 6.83f, 7.99f, 6.39f, 8.76f)
                curveTo(5.95f, 9.53f, 5.04f, 9.97f, 3.9f, 9.97f)
                curveTo(3.26f, 9.97f, 2.75f, 10.48f, 2.75f, 11.12f)
                verticalLineTo(12.88f)
                curveTo(2.75f, 13.51f, 3.26f, 14.03f, 3.9f, 14.03f)
                curveTo(5.04f, 14.03f, 5.95f, 14.47f, 6.39f, 15.24f)
                curveTo(6.83f, 16.01f, 6.76f, 17.02f, 6.19f, 18f)
                curveTo(6.04f, 18.26f, 6f, 18.57f, 6.08f, 18.87f)
                curveTo(6.16f, 19.17f, 6.35f, 19.41f, 6.61f, 19.57f)
                lineTo(8.34f, 20.56f)
                curveTo(8.55f, 20.69f, 8.8f, 20.72f, 9.03f, 20.66f)
                curveTo(9.27f, 20.6f, 9.47f, 20.44f, 9.6f, 20.23f)
                lineTo(9.71f, 20.04f)
                curveTo(10.28f, 19.06f, 11.11f, 18.49f, 12f, 18.49f)
                close()
            }
        }.build()

        return _Setting2!!
    }

@Suppress("ObjectPropertyName")
private var _Setting2: ImageVector? = null
