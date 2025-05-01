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

val Iconsax.Outline.EmptyWallet: ImageVector
    get() {
        if (_EmptyWallet != null) {
            return _EmptyWallet!!
        }
        _EmptyWallet = ImageVector.Builder(
            name = "Outline.EmptyWallet",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.74f, 22.75f)
                horizontalLineTo(6.26f)
                curveTo(3.77f, 22.75f, 1.75f, 20.73f, 1.75f, 18.24f)
                verticalLineTo(11.51f)
                curveTo(1.75f, 9.02f, 3.77f, 7f, 6.26f, 7f)
                horizontalLineTo(17.74f)
                curveTo(20.23f, 7f, 22.25f, 9.02f, 22.25f, 11.51f)
                verticalLineTo(12.95f)
                curveTo(22.25f, 13.36f, 21.91f, 13.7f, 21.5f, 13.7f)
                horizontalLineTo(19.48f)
                curveTo(19.13f, 13.7f, 18.81f, 13.83f, 18.58f, 14.07f)
                lineTo(18.57f, 14.08f)
                curveTo(18.29f, 14.35f, 18.16f, 14.72f, 18.19f, 15.1f)
                curveTo(18.25f, 15.76f, 18.88f, 16.29f, 19.6f, 16.29f)
                horizontalLineTo(21.5f)
                curveTo(21.91f, 16.29f, 22.25f, 16.63f, 22.25f, 17.04f)
                verticalLineTo(18.23f)
                curveTo(22.25f, 20.73f, 20.23f, 22.75f, 17.74f, 22.75f)
                close()
                moveTo(6.26f, 8.5f)
                curveTo(4.6f, 8.5f, 3.25f, 9.85f, 3.25f, 11.51f)
                verticalLineTo(18.24f)
                curveTo(3.25f, 19.9f, 4.6f, 21.25f, 6.26f, 21.25f)
                horizontalLineTo(17.74f)
                curveTo(19.4f, 21.25f, 20.75f, 19.9f, 20.75f, 18.24f)
                verticalLineTo(17.8f)
                horizontalLineTo(19.6f)
                curveTo(18.09f, 17.8f, 16.81f, 16.68f, 16.69f, 15.24f)
                curveTo(16.61f, 14.42f, 16.91f, 13.61f, 17.51f, 13.02f)
                curveTo(18.03f, 12.49f, 18.73f, 12.2f, 19.48f, 12.2f)
                horizontalLineTo(20.75f)
                verticalLineTo(11.51f)
                curveTo(20.75f, 9.85f, 19.4f, 8.5f, 17.74f, 8.5f)
                horizontalLineTo(6.26f)
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
        }.build()

        return _EmptyWallet!!
    }

@Suppress("ObjectPropertyName")
private var _EmptyWallet: ImageVector? = null
