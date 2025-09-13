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

val Iconsax.Outline.Messages: ImageVector
    get() {
        if (_Messages != null) {
            return _Messages!!
        }
        _Messages = ImageVector.Builder(
            name = "Outline.Messages",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.99f, 22.78f)
                curveTo(9.39f, 22.78f, 8.82f, 22.48f, 8.43f, 21.95f)
                lineTo(7.23f, 20.35f)
                curveTo(7.23f, 20.36f, 7.18f, 20.33f, 7.16f, 20.33f)
                horizontalLineTo(6.79f)
                curveTo(3.37f, 20.33f, 1.25f, 19.4f, 1.25f, 14.79f)
                verticalLineTo(10.79f)
                curveTo(1.25f, 6.58f, 3.82f, 5.48f, 5.98f, 5.29f)
                curveTo(6.22f, 5.26f, 6.5f, 5.25f, 6.79f, 5.25f)
                horizontalLineTo(13.19f)
                curveTo(16.81f, 5.25f, 18.73f, 7.17f, 18.73f, 10.79f)
                verticalLineTo(14.79f)
                curveTo(18.73f, 15.08f, 18.72f, 15.36f, 18.68f, 15.63f)
                curveTo(18.5f, 17.76f, 17.4f, 20.33f, 13.19f, 20.33f)
                horizontalLineTo(12.79f)
                lineTo(11.55f, 21.95f)
                curveTo(11.16f, 22.48f, 10.59f, 22.78f, 9.99f, 22.78f)
                close()
                moveTo(6.79f, 6.75f)
                curveTo(6.56f, 6.75f, 6.34f, 6.76f, 6.13f, 6.78f)
                curveTo(3.81f, 6.98f, 2.75f, 8.25f, 2.75f, 10.79f)
                verticalLineTo(14.79f)
                curveTo(2.75f, 18.22f, 3.81f, 18.83f, 6.79f, 18.83f)
                horizontalLineTo(7.19f)
                curveTo(7.64f, 18.83f, 8.15f, 19.08f, 8.43f, 19.44f)
                lineTo(9.63f, 21.05f)
                curveTo(9.85f, 21.35f, 10.13f, 21.35f, 10.35f, 21.05f)
                lineTo(11.55f, 19.45f)
                curveTo(11.84f, 19.06f, 12.3f, 18.83f, 12.79f, 18.83f)
                horizontalLineTo(13.19f)
                curveTo(15.73f, 18.83f, 17f, 17.76f, 17.19f, 15.48f)
                curveTo(17.22f, 15.24f, 17.23f, 15.02f, 17.23f, 14.79f)
                verticalLineTo(10.79f)
                curveTo(17.23f, 8f, 15.98f, 6.75f, 13.19f, 6.75f)
                horizontalLineTo(6.79f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(9.99f, 14.19f)
                curveTo(9.43f, 14.19f, 8.99f, 13.74f, 8.99f, 13.19f)
                curveTo(8.99f, 12.64f, 9.44f, 12.19f, 9.99f, 12.19f)
                curveTo(10.54f, 12.19f, 10.99f, 12.64f, 10.99f, 13.19f)
                curveTo(10.99f, 13.74f, 10.55f, 14.19f, 9.99f, 14.19f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(13.189f, 14.19f)
                curveTo(12.63f, 14.19f, 12.189f, 13.74f, 12.189f, 13.19f)
                curveTo(12.189f, 12.64f, 12.639f, 12.19f, 13.189f, 12.19f)
                curveTo(13.74f, 12.19f, 14.189f, 12.64f, 14.189f, 13.19f)
                curveTo(14.189f, 13.74f, 13.74f, 14.19f, 13.189f, 14.19f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(6.801f, 14.19f)
                curveTo(6.241f, 14.19f, 5.801f, 13.74f, 5.801f, 13.19f)
                curveTo(5.801f, 12.64f, 6.251f, 12.19f, 6.801f, 12.19f)
                curveTo(7.351f, 12.19f, 7.801f, 12.64f, 7.801f, 13.19f)
                curveTo(7.801f, 13.74f, 7.351f, 14.19f, 6.801f, 14.19f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.94f, 16.29f)
                curveTo(17.74f, 16.29f, 17.54f, 16.21f, 17.4f, 16.06f)
                curveTo(17.24f, 15.9f, 17.17f, 15.67f, 17.2f, 15.45f)
                curveTo(17.23f, 15.24f, 17.24f, 15.02f, 17.24f, 14.79f)
                verticalLineTo(10.79f)
                curveTo(17.24f, 8f, 15.99f, 6.75f, 13.2f, 6.75f)
                horizontalLineTo(6.8f)
                curveTo(6.57f, 6.75f, 6.35f, 6.76f, 6.14f, 6.78f)
                curveTo(5.92f, 6.81f, 5.69f, 6.73f, 5.53f, 6.58f)
                curveTo(5.37f, 6.42f, 5.28f, 6.2f, 5.3f, 5.98f)
                curveTo(5.48f, 3.82f, 6.59f, 1.25f, 10.8f, 1.25f)
                horizontalLineTo(17.2f)
                curveTo(20.82f, 1.25f, 22.74f, 3.17f, 22.74f, 6.79f)
                verticalLineTo(10.79f)
                curveTo(22.74f, 15f, 20.17f, 16.1f, 18.01f, 16.29f)
                curveTo(17.98f, 16.29f, 17.96f, 16.29f, 17.94f, 16.29f)
                close()
                moveTo(6.92f, 5.25f)
                horizontalLineTo(13.19f)
                curveTo(16.81f, 5.25f, 18.73f, 7.17f, 18.73f, 10.79f)
                verticalLineTo(14.66f)
                curveTo(20.43f, 14.24f, 21.23f, 12.99f, 21.23f, 10.79f)
                verticalLineTo(6.79f)
                curveTo(21.23f, 4f, 19.98f, 2.75f, 17.19f, 2.75f)
                horizontalLineTo(10.79f)
                curveTo(8.59f, 2.75f, 7.35f, 3.55f, 6.92f, 5.25f)
                close()
            }
        }.build()

        return _Messages!!
    }

@Suppress("ObjectPropertyName")
private var _Messages: ImageVector? = null
