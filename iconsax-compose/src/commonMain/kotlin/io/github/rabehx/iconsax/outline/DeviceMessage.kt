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

val Iconsax.Outline.DeviceMessage: ImageVector
    get() {
        if (_DeviceMessage != null) {
            return _DeviceMessage!!
        }
        _DeviceMessage = ImageVector.Builder(
            name = "Outline.DeviceMessage",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.5f, 19.15f)
                horizontalLineTo(6.5f)
                curveTo(3.16f, 19.15f, 1.25f, 17.24f, 1.25f, 13.9f)
                verticalLineTo(8.5f)
                curveTo(1.25f, 5.16f, 3.16f, 3.25f, 6.5f, 3.25f)
                horizontalLineTo(9.2f)
                curveTo(9.44f, 3.25f, 9.67f, 3.37f, 9.81f, 3.56f)
                curveTo(9.95f, 3.75f, 9.99f, 4.01f, 9.91f, 4.24f)
                curveTo(9.8f, 4.55f, 9.75f, 4.89f, 9.75f, 5.25f)
                verticalLineTo(9.15f)
                curveTo(9.75f, 9.91f, 9.98f, 10.54f, 10.42f, 10.98f)
                curveTo(10.86f, 11.42f, 11.49f, 11.65f, 12.25f, 11.65f)
                curveTo(12.66f, 11.65f, 13f, 11.99f, 13f, 12.4f)
                verticalLineTo(13.6f)
                lineTo(15.73f, 11.77f)
                curveTo(15.85f, 11.69f, 16f, 11.64f, 16.15f, 11.64f)
                horizontalLineTo(18.75f)
                curveTo(19.11f, 11.64f, 19.45f, 11.59f, 19.76f, 11.48f)
                curveTo(19.99f, 11.4f, 20.24f, 11.44f, 20.44f, 11.58f)
                curveTo(20.64f, 11.72f, 20.75f, 11.95f, 20.75f, 12.19f)
                verticalLineTo(13.89f)
                curveTo(20.75f, 17.24f, 18.84f, 19.15f, 15.5f, 19.15f)
                close()
                moveTo(6.5f, 4.75f)
                curveTo(3.98f, 4.75f, 2.75f, 5.98f, 2.75f, 8.5f)
                verticalLineTo(13.9f)
                curveTo(2.75f, 16.42f, 3.98f, 17.65f, 6.5f, 17.65f)
                horizontalLineTo(15.5f)
                curveTo(18.02f, 17.65f, 19.25f, 16.42f, 19.25f, 13.9f)
                verticalLineTo(13.12f)
                curveTo(19.09f, 13.14f, 18.92f, 13.15f, 18.75f, 13.15f)
                horizontalLineTo(16.38f)
                lineTo(13.68f, 14.95f)
                curveTo(13.24f, 15.23f, 12.69f, 15.26f, 12.24f, 15.01f)
                curveTo(11.79f, 14.77f, 11.51f, 14.3f, 11.51f, 13.79f)
                verticalLineTo(13.09f)
                curveTo(10.67f, 12.96f, 9.93f, 12.59f, 9.37f, 12.04f)
                curveTo(8.66f, 11.33f, 8.26f, 10.3f, 8.26f, 9.15f)
                verticalLineTo(5.25f)
                curveTo(8.26f, 5.08f, 8.27f, 4.91f, 8.28f, 4.75f)
                horizontalLineTo(6.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.9f, 15.18f)
                curveTo(12.67f, 15.18f, 12.44f, 15.12f, 12.23f, 15.01f)
                curveTo(11.78f, 14.77f, 11.5f, 14.3f, 11.5f, 13.79f)
                verticalLineTo(13.09f)
                curveTo(10.66f, 12.96f, 9.92f, 12.59f, 9.36f, 12.04f)
                curveTo(8.65f, 11.33f, 8.25f, 10.3f, 8.25f, 9.15f)
                verticalLineTo(5.25f)
                curveTo(8.25f, 4.72f, 8.33f, 4.22f, 8.49f, 3.76f)
                curveTo(9.05f, 2.19f, 10.45f, 1.25f, 12.25f, 1.25f)
                horizontalLineTo(18.75f)
                curveTo(21.1f, 1.25f, 22.75f, 2.89f, 22.75f, 5.25f)
                verticalLineTo(9.15f)
                curveTo(22.75f, 10.95f, 21.82f, 12.35f, 20.25f, 12.91f)
                curveTo(19.77f, 13.07f, 19.27f, 13.15f, 18.75f, 13.15f)
                horizontalLineTo(16.38f)
                lineTo(13.68f, 14.95f)
                curveTo(13.44f, 15.11f, 13.17f, 15.18f, 12.9f, 15.18f)
                close()
                moveTo(12.25f, 2.75f)
                curveTo(11.1f, 2.75f, 10.25f, 3.3f, 9.91f, 4.25f)
                curveTo(9.81f, 4.55f, 9.75f, 4.89f, 9.75f, 5.25f)
                verticalLineTo(9.15f)
                curveTo(9.75f, 9.91f, 9.98f, 10.54f, 10.42f, 10.98f)
                curveTo(10.86f, 11.42f, 11.49f, 11.65f, 12.25f, 11.65f)
                curveTo(12.66f, 11.65f, 13f, 11.99f, 13f, 12.4f)
                verticalLineTo(13.6f)
                lineTo(15.73f, 11.77f)
                curveTo(15.85f, 11.69f, 16f, 11.64f, 16.15f, 11.64f)
                horizontalLineTo(18.75f)
                curveTo(19.11f, 11.64f, 19.45f, 11.59f, 19.76f, 11.48f)
                curveTo(20.71f, 11.14f, 21.25f, 10.29f, 21.25f, 9.14f)
                verticalLineTo(5.24f)
                curveTo(21.25f, 3.7f, 20.29f, 2.74f, 18.75f, 2.74f)
                horizontalLineTo(12.25f)
                verticalLineTo(2.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(14.6f, 22.75f)
                horizontalLineTo(7.4f)
                curveTo(6.99f, 22.75f, 6.65f, 22.41f, 6.65f, 22f)
                curveTo(6.65f, 21.59f, 6.99f, 21.25f, 7.4f, 21.25f)
                horizontalLineTo(14.6f)
                curveTo(15.01f, 21.25f, 15.35f, 21.59f, 15.35f, 22f)
                curveTo(15.35f, 22.41f, 15.01f, 22.75f, 14.6f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(11f, 22.75f)
                curveTo(10.59f, 22.75f, 10.25f, 22.41f, 10.25f, 22f)
                verticalLineTo(18.4f)
                curveTo(10.25f, 17.99f, 10.59f, 17.65f, 11f, 17.65f)
                curveTo(11.41f, 17.65f, 11.75f, 17.99f, 11.75f, 18.4f)
                verticalLineTo(22f)
                curveTo(11.75f, 22.41f, 11.41f, 22.75f, 11f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(15.439f, 8f)
                curveTo(15.019f, 8f, 14.689f, 7.66f, 14.689f, 7.25f)
                curveTo(14.689f, 6.84f, 15.03f, 6.5f, 15.439f, 6.5f)
                curveTo(15.849f, 6.5f, 16.19f, 6.84f, 16.19f, 7.25f)
                curveTo(16.19f, 7.66f, 15.849f, 8f, 15.439f, 8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(18.25f, 8f)
                curveTo(17.83f, 8f, 17.5f, 7.66f, 17.5f, 7.25f)
                curveTo(17.5f, 6.84f, 17.84f, 6.5f, 18.25f, 6.5f)
                curveTo(18.66f, 6.5f, 19f, 6.84f, 19f, 7.25f)
                curveTo(19f, 7.66f, 18.66f, 8f, 18.25f, 8f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.621f, 8f)
                curveTo(12.201f, 8f, 11.871f, 7.66f, 11.871f, 7.25f)
                curveTo(11.871f, 6.84f, 12.211f, 6.5f, 12.621f, 6.5f)
                curveTo(13.031f, 6.5f, 13.371f, 6.84f, 13.371f, 7.25f)
                curveTo(13.371f, 7.66f, 13.041f, 8f, 12.621f, 8f)
                close()
            }
        }.build()

        return _DeviceMessage!!
    }

@Suppress("ObjectPropertyName")
private var _DeviceMessage: ImageVector? = null
