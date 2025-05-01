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

val Iconsax.Outline.LikeDislike: ImageVector
    get() {
        if (_LikeDislike != null) {
            return _LikeDislike!!
        }
        _LikeDislike = ImageVector.Builder(
            name = "Outline.LikeDislike",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.949f, 22.75f)
                horizontalLineTo(7.779f)
                curveTo(7.389f, 22.75f, 6.609f, 22.63f, 6.159f, 22.19f)
                lineTo(4.459f, 20.88f)
                lineTo(5.379f, 19.69f)
                lineTo(7.149f, 21.06f)
                curveTo(7.279f, 21.17f, 7.549f, 21.25f, 7.779f, 21.25f)
                horizontalLineTo(9.949f)
                curveTo(10.319f, 21.25f, 10.739f, 20.94f, 10.819f, 20.62f)
                lineTo(12.209f, 16.39f)
                curveTo(12.249f, 16.29f, 12.279f, 16.14f, 12.209f, 16.03f)
                curveTo(12.149f, 15.94f, 12.009f, 15.89f, 11.839f, 15.89f)
                horizontalLineTo(9.549f)
                curveTo(9.159f, 15.89f, 8.799f, 15.72f, 8.539f, 15.43f)
                curveTo(8.279f, 15.13f, 8.169f, 14.75f, 8.229f, 14.34f)
                lineTo(8.519f, 12.5f)
                curveTo(8.559f, 12.33f, 8.439f, 12.12f, 8.279f, 12.07f)
                curveTo(8.149f, 12.02f, 7.929f, 12.11f, 7.879f, 12.18f)
                lineTo(5.529f, 15.67f)
                lineTo(4.279f, 14.83f)
                lineTo(6.619f, 11.34f)
                curveTo(7.059f, 10.68f, 8.019f, 10.38f, 8.759f, 10.66f)
                curveTo(9.609f, 10.94f, 10.169f, 11.9f, 9.969f, 12.78f)
                lineTo(9.719f, 14.38f)
                horizontalLineTo(11.809f)
                curveTo(12.479f, 14.38f, 13.059f, 14.66f, 13.409f, 15.16f)
                curveTo(13.749f, 15.64f, 13.819f, 16.27f, 13.599f, 16.87f)
                lineTo(12.229f, 21.03f)
                curveTo(12.029f, 21.97f, 11.009f, 22.75f, 9.949f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(3.72f, 22.12f)
                horizontalLineTo(3.15f)
                curveTo(1.59f, 22.12f, 1.26f, 21.12f, 1.26f, 20.28f)
                verticalLineTo(14.68f)
                curveTo(1.26f, 13.84f, 1.59f, 12.84f, 3.15f, 12.84f)
                horizontalLineTo(3.72f)
                curveTo(5.28f, 12.84f, 5.61f, 13.84f, 5.61f, 14.68f)
                verticalLineTo(20.28f)
                curveTo(5.61f, 21.12f, 5.28f, 22.12f, 3.72f, 22.12f)
                close()
                moveTo(2.79f, 20.58f)
                curveTo(2.8f, 20.58f, 2.9f, 20.62f, 3.14f, 20.62f)
                horizontalLineTo(3.71f)
                curveTo(3.97f, 20.62f, 4.06f, 20.58f, 4.08f, 20.57f)
                curveTo(4.08f, 20.56f, 4.11f, 20.49f, 4.11f, 20.28f)
                verticalLineTo(14.68f)
                curveTo(4.11f, 14.47f, 4.08f, 14.39f, 4.07f, 14.38f)
                curveTo(4.07f, 14.4f, 3.97f, 14.34f, 3.72f, 14.34f)
                horizontalLineTo(3.15f)
                curveTo(2.89f, 14.34f, 2.8f, 14.38f, 2.78f, 14.39f)
                curveTo(2.78f, 14.4f, 2.75f, 14.47f, 2.75f, 14.68f)
                verticalLineTo(20.28f)
                curveTo(2.75f, 20.49f, 2.78f, 20.57f, 2.79f, 20.58f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.81f, 13.44f)
                curveTo(15.61f, 13.44f, 15.41f, 13.41f, 15.22f, 13.34f)
                curveTo(14.37f, 13.06f, 13.81f, 12.1f, 14.01f, 11.22f)
                lineTo(14.26f, 9.62f)
                horizontalLineTo(12.17f)
                curveTo(11.5f, 9.62f, 10.92f, 9.34f, 10.57f, 8.84f)
                curveTo(10.23f, 8.36f, 10.16f, 7.73f, 10.38f, 7.13f)
                lineTo(11.75f, 2.97f)
                curveTo(11.98f, 2.03f, 13.01f, 1.25f, 14.06f, 1.25f)
                horizontalLineTo(16.23f)
                curveTo(16.62f, 1.25f, 17.4f, 1.37f, 17.85f, 1.81f)
                lineTo(19.55f, 3.12f)
                lineTo(18.63f, 4.31f)
                lineTo(16.86f, 2.94f)
                curveTo(16.73f, 2.83f, 16.46f, 2.75f, 16.23f, 2.75f)
                horizontalLineTo(14.06f)
                curveTo(13.69f, 2.75f, 13.27f, 3.06f, 13.19f, 3.38f)
                lineTo(11.8f, 7.61f)
                curveTo(11.76f, 7.71f, 11.73f, 7.86f, 11.8f, 7.97f)
                curveTo(11.86f, 8.06f, 12f, 8.11f, 12.17f, 8.11f)
                horizontalLineTo(14.46f)
                curveTo(14.85f, 8.11f, 15.21f, 8.28f, 15.47f, 8.57f)
                curveTo(15.73f, 8.87f, 15.84f, 9.25f, 15.78f, 9.66f)
                lineTo(15.49f, 11.5f)
                curveTo(15.45f, 11.67f, 15.57f, 11.88f, 15.73f, 11.93f)
                curveTo(15.87f, 11.98f, 16.08f, 11.9f, 16.13f, 11.82f)
                lineTo(18.48f, 8.33f)
                lineTo(19.73f, 9.17f)
                lineTo(17.39f, 12.66f)
                curveTo(17.03f, 13.14f, 16.41f, 13.44f, 15.81f, 13.44f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.86f, 11.16f)
                horizontalLineTo(20.29f)
                curveTo(18.73f, 11.16f, 18.4f, 10.16f, 18.4f, 9.32f)
                verticalLineTo(3.72f)
                curveTo(18.4f, 2.88f, 18.73f, 1.88f, 20.29f, 1.88f)
                horizontalLineTo(20.86f)
                curveTo(22.42f, 1.88f, 22.75f, 2.88f, 22.75f, 3.72f)
                verticalLineTo(9.32f)
                curveTo(22.75f, 10.16f, 22.42f, 11.16f, 20.86f, 11.16f)
                close()
                moveTo(19.93f, 9.62f)
                curveTo(19.94f, 9.62f, 20.04f, 9.66f, 20.28f, 9.66f)
                horizontalLineTo(20.85f)
                curveTo(21.11f, 9.66f, 21.2f, 9.62f, 21.22f, 9.61f)
                curveTo(21.22f, 9.6f, 21.25f, 9.53f, 21.25f, 9.32f)
                verticalLineTo(3.72f)
                curveTo(21.25f, 3.51f, 21.22f, 3.44f, 21.21f, 3.42f)
                curveTo(21.22f, 3.46f, 21.11f, 3.38f, 20.86f, 3.38f)
                horizontalLineTo(20.29f)
                curveTo(20.03f, 3.38f, 19.94f, 3.42f, 19.92f, 3.43f)
                curveTo(19.92f, 3.44f, 19.89f, 3.51f, 19.89f, 3.72f)
                verticalLineTo(9.32f)
                curveTo(19.89f, 9.53f, 19.92f, 9.6f, 19.93f, 9.62f)
                close()
            }
        }.build()

        return _LikeDislike!!
    }

@Suppress("ObjectPropertyName")
private var _LikeDislike: ImageVector? = null
