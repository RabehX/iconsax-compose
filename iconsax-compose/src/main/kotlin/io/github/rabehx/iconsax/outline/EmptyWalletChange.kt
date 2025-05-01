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

val Iconsax.Outline.EmptyWalletChange: ImageVector
    get() {
        if (_EmptyWalletChange != null) {
            return _EmptyWalletChange!!
        }
        _EmptyWalletChange = ImageVector.Builder(
            name = "Outline.EmptyWalletChange",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.74f, 22.75f)
                horizontalLineTo(12.26f)
                curveTo(11.85f, 22.75f, 11.51f, 22.41f, 11.51f, 22f)
                curveTo(11.51f, 21.59f, 11.85f, 21.25f, 12.26f, 21.25f)
                horizontalLineTo(17.74f)
                curveTo(19.4f, 21.25f, 20.75f, 19.9f, 20.75f, 18.24f)
                verticalLineTo(17.8f)
                horizontalLineTo(19.6f)
                curveTo(18.09f, 17.8f, 16.81f, 16.68f, 16.69f, 15.24f)
                curveTo(16.61f, 14.41f, 16.91f, 13.6f, 17.51f, 13.01f)
                curveTo(18.02f, 12.49f, 18.72f, 12.2f, 19.47f, 12.2f)
                horizontalLineTo(20.74f)
                verticalLineTo(11.51f)
                curveTo(20.74f, 9.85f, 19.39f, 8.5f, 17.73f, 8.5f)
                horizontalLineTo(6.25f)
                curveTo(4.59f, 8.5f, 3.24f, 9.85f, 3.24f, 11.51f)
                verticalLineTo(13.24f)
                curveTo(3.24f, 13.65f, 2.9f, 13.99f, 2.49f, 13.99f)
                curveTo(2.08f, 13.99f, 1.74f, 13.65f, 1.74f, 13.24f)
                verticalLineTo(11.51f)
                curveTo(1.74f, 9.02f, 3.76f, 7f, 6.25f, 7f)
                horizontalLineTo(17.73f)
                curveTo(20.22f, 7f, 22.24f, 9.02f, 22.24f, 11.51f)
                verticalLineTo(12.95f)
                curveTo(22.24f, 13.36f, 21.9f, 13.7f, 21.49f, 13.7f)
                horizontalLineTo(19.47f)
                curveTo(19.12f, 13.7f, 18.8f, 13.83f, 18.57f, 14.07f)
                curveTo(18.28f, 14.35f, 18.14f, 14.73f, 18.18f, 15.11f)
                curveTo(18.24f, 15.77f, 18.87f, 16.3f, 19.59f, 16.3f)
                horizontalLineTo(21.49f)
                curveTo(21.9f, 16.3f, 22.24f, 16.64f, 22.24f, 17.05f)
                verticalLineTo(18.24f)
                curveTo(22.25f, 20.73f, 20.23f, 22.75f, 17.74f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(2.5f, 13.16f)
                curveTo(2.09f, 13.16f, 1.75f, 12.82f, 1.75f, 12.41f)
                verticalLineTo(7.84f)
                curveTo(1.75f, 6.35f, 2.69f, 5f, 4.08f, 4.47f)
                lineTo(12.02f, 1.47f)
                curveTo(12.84f, 1.16f, 13.75f, 1.27f, 14.46f, 1.77f)
                curveTo(15.18f, 2.27f, 15.6f, 3.08f, 15.6f, 3.95f)
                verticalLineTo(7.75f)
                curveTo(15.6f, 8.16f, 15.26f, 8.5f, 14.85f, 8.5f)
                curveTo(14.44f, 8.5f, 14.1f, 8.16f, 14.1f, 7.75f)
                verticalLineTo(3.95f)
                curveTo(14.1f, 3.57f, 13.92f, 3.22f, 13.6f, 3f)
                curveTo(13.28f, 2.78f, 12.9f, 2.73f, 12.54f, 2.87f)
                lineTo(4.6f, 5.87f)
                curveTo(3.79f, 6.18f, 3.24f, 6.97f, 3.24f, 7.84f)
                verticalLineTo(12.41f)
                curveTo(3.25f, 12.83f, 2.91f, 13.16f, 2.5f, 13.16f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.601f, 17.8f)
                curveTo(18.09f, 17.8f, 16.81f, 16.68f, 16.691f, 15.24f)
                curveTo(16.611f, 14.41f, 16.91f, 13.6f, 17.51f, 13.01f)
                curveTo(18.021f, 12.49f, 18.721f, 12.2f, 19.471f, 12.2f)
                horizontalLineTo(21.551f)
                curveTo(22.541f, 12.23f, 23.301f, 13.01f, 23.301f, 13.97f)
                verticalLineTo(16.03f)
                curveTo(23.301f, 16.99f, 22.541f, 17.77f, 21.58f, 17.8f)
                horizontalLineTo(19.601f)
                close()
                moveTo(21.531f, 13.7f)
                horizontalLineTo(19.48f)
                curveTo(19.131f, 13.7f, 18.81f, 13.83f, 18.58f, 14.07f)
                curveTo(18.291f, 14.35f, 18.15f, 14.73f, 18.191f, 15.11f)
                curveTo(18.25f, 15.77f, 18.881f, 16.3f, 19.601f, 16.3f)
                horizontalLineTo(21.56f)
                curveTo(21.691f, 16.3f, 21.81f, 16.18f, 21.81f, 16.03f)
                verticalLineTo(13.97f)
                curveTo(21.81f, 13.82f, 21.691f, 13.71f, 21.531f, 13.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14f, 12.75f)
                horizontalLineTo(7f)
                curveTo(6.59f, 12.75f, 6.25f, 12.41f, 6.25f, 12f)
                curveTo(6.25f, 11.59f, 6.59f, 11.25f, 7f, 11.25f)
                horizontalLineTo(14f)
                curveTo(14.41f, 11.25f, 14.75f, 11.59f, 14.75f, 12f)
                curveTo(14.75f, 12.41f, 14.41f, 12.75f, 14f, 12.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.5f, 19.69f)
                curveTo(9.09f, 19.69f, 8.75f, 19.35f, 8.75f, 18.94f)
                verticalLineTo(17.66f)
                curveTo(8.75f, 17.44f, 8.57f, 17.25f, 8.34f, 17.25f)
                horizontalLineTo(3f)
                curveTo(2.59f, 17.25f, 2.25f, 16.91f, 2.25f, 16.5f)
                curveTo(2.25f, 16.09f, 2.59f, 15.75f, 3f, 15.75f)
                horizontalLineTo(8.34f)
                curveTo(9.39f, 15.75f, 10.25f, 16.61f, 10.25f, 17.66f)
                verticalLineTo(18.94f)
                curveTo(10.25f, 19.35f, 9.91f, 19.69f, 9.5f, 19.69f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(4.219f, 18.47f)
                curveTo(4.029f, 18.47f, 3.839f, 18.4f, 3.689f, 18.25f)
                lineTo(2.469f, 17.03f)
                curveTo(2.179f, 16.74f, 2.179f, 16.26f, 2.469f, 15.97f)
                lineTo(3.689f, 14.75f)
                curveTo(3.979f, 14.46f, 4.459f, 14.46f, 4.749f, 14.75f)
                curveTo(5.039f, 15.04f, 5.039f, 15.52f, 4.749f, 15.81f)
                lineTo(4.059f, 16.5f)
                lineTo(4.749f, 17.19f)
                curveTo(5.039f, 17.48f, 5.039f, 17.96f, 4.749f, 18.25f)
                curveTo(4.599f, 18.4f, 4.409f, 18.47f, 4.219f, 18.47f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.5f, 22.53f)
                horizontalLineTo(4.16f)
                curveTo(3.11f, 22.53f, 2.25f, 21.67f, 2.25f, 20.62f)
                verticalLineTo(19.34f)
                curveTo(2.25f, 18.93f, 2.59f, 18.59f, 3f, 18.59f)
                curveTo(3.41f, 18.59f, 3.75f, 18.93f, 3.75f, 19.34f)
                verticalLineTo(20.62f)
                curveTo(3.75f, 20.84f, 3.93f, 21.03f, 4.16f, 21.03f)
                horizontalLineTo(9.5f)
                curveTo(9.91f, 21.03f, 10.25f, 21.37f, 10.25f, 21.78f)
                curveTo(10.25f, 22.19f, 9.91f, 22.53f, 9.5f, 22.53f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(8.281f, 23.75f)
                curveTo(8.091f, 23.75f, 7.901f, 23.68f, 7.751f, 23.53f)
                curveTo(7.461f, 23.24f, 7.461f, 22.76f, 7.751f, 22.47f)
                lineTo(8.441f, 21.78f)
                lineTo(7.751f, 21.09f)
                curveTo(7.461f, 20.8f, 7.461f, 20.32f, 7.751f, 20.03f)
                curveTo(8.041f, 19.74f, 8.521f, 19.74f, 8.811f, 20.03f)
                lineTo(10.031f, 21.25f)
                curveTo(10.321f, 21.54f, 10.321f, 22.02f, 10.031f, 22.31f)
                lineTo(8.811f, 23.53f)
                curveTo(8.671f, 23.68f, 8.471f, 23.75f, 8.281f, 23.75f)
                close()
            }
        }.build()

        return _EmptyWalletChange!!
    }

@Suppress("ObjectPropertyName")
private var _EmptyWalletChange: ImageVector? = null
