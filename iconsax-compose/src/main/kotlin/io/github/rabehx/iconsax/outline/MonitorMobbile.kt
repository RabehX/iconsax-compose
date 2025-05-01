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

val Iconsax.Outline.MonitorMobbile: ImageVector
    get() {
        if (_MonitorMobbile != null) {
            return _MonitorMobbile!!
        }
        _MonitorMobbile = ImageVector.Builder(
            name = "Outline.MonitorMobbile",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10f, 17.7f)
                horizontalLineTo(6.21f)
                curveTo(2.41f, 17.7f, 1.25f, 16.54f, 1.25f, 12.74f)
                verticalLineTo(6.74f)
                curveTo(1.25f, 2.94f, 2.41f, 1.78f, 6.21f, 1.78f)
                horizontalLineTo(16.74f)
                curveTo(20.54f, 1.78f, 21.7f, 2.94f, 21.7f, 6.74f)
                curveTo(21.7f, 7.15f, 21.36f, 7.49f, 20.95f, 7.49f)
                curveTo(20.54f, 7.49f, 20.2f, 7.15f, 20.2f, 6.74f)
                curveTo(20.2f, 3.8f, 19.68f, 3.28f, 16.74f, 3.28f)
                horizontalLineTo(6.21f)
                curveTo(3.27f, 3.28f, 2.75f, 3.8f, 2.75f, 6.74f)
                verticalLineTo(12.74f)
                curveTo(2.75f, 15.68f, 3.27f, 16.2f, 6.21f, 16.2f)
                horizontalLineTo(10f)
                curveTo(10.41f, 16.2f, 10.75f, 16.54f, 10.75f, 16.95f)
                curveTo(10.75f, 17.36f, 10.41f, 17.7f, 10f, 17.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10f, 22.22f)
                curveTo(9.59f, 22.22f, 9.25f, 21.88f, 9.25f, 21.47f)
                verticalLineTo(16.94f)
                curveTo(9.25f, 16.53f, 9.59f, 16.19f, 10f, 16.19f)
                curveTo(10.41f, 16.19f, 10.75f, 16.53f, 10.75f, 16.94f)
                verticalLineTo(21.47f)
                curveTo(10.75f, 21.89f, 10.41f, 22.22f, 10f, 22.22f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10f, 13.7f)
                horizontalLineTo(2f)
                curveTo(1.59f, 13.7f, 1.25f, 13.36f, 1.25f, 12.95f)
                curveTo(1.25f, 12.54f, 1.59f, 12.2f, 2f, 12.2f)
                horizontalLineTo(10f)
                curveTo(10.41f, 12.2f, 10.75f, 12.54f, 10.75f, 12.95f)
                curveTo(10.75f, 13.36f, 10.41f, 13.7f, 10f, 13.7f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10f, 22.22f)
                horizontalLineTo(6.74f)
                curveTo(6.33f, 22.22f, 5.99f, 21.88f, 5.99f, 21.47f)
                curveTo(5.99f, 21.06f, 6.33f, 20.72f, 6.74f, 20.72f)
                horizontalLineTo(10f)
                curveTo(10.41f, 20.72f, 10.75f, 21.06f, 10.75f, 21.47f)
                curveTo(10.75f, 21.88f, 10.41f, 22.22f, 10f, 22.22f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(19.04f, 22.22f)
                horizontalLineTo(15.49f)
                curveTo(12.72f, 22.22f, 11.78f, 21.28f, 11.78f, 18.51f)
                verticalLineTo(12.8f)
                curveTo(11.78f, 10.03f, 12.72f, 9.09f, 15.49f, 9.09f)
                horizontalLineTo(19.04f)
                curveTo(21.81f, 9.09f, 22.75f, 10.03f, 22.75f, 12.8f)
                verticalLineTo(18.51f)
                curveTo(22.75f, 21.29f, 21.81f, 22.22f, 19.04f, 22.22f)
                close()
                moveTo(15.49f, 10.59f)
                curveTo(13.53f, 10.59f, 13.28f, 10.84f, 13.28f, 12.8f)
                verticalLineTo(18.51f)
                curveTo(13.28f, 20.47f, 13.53f, 20.72f, 15.49f, 20.72f)
                horizontalLineTo(19.04f)
                curveTo(21f, 20.72f, 21.25f, 20.47f, 21.25f, 18.51f)
                verticalLineTo(12.8f)
                curveTo(21.25f, 10.84f, 21f, 10.59f, 19.04f, 10.59f)
                horizontalLineTo(15.49f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.3f, 18.97f)
                curveTo(17.04f, 18.97f, 16.78f, 18.87f, 16.59f, 18.68f)
                curveTo(16.5f, 18.59f, 16.43f, 18.48f, 16.38f, 18.36f)
                curveTo(16.33f, 18.23f, 16.3f, 18.1f, 16.3f, 17.97f)
                curveTo(16.3f, 17.71f, 16.41f, 17.45f, 16.59f, 17.27f)
                curveTo(16.82f, 17.04f, 17.17f, 16.93f, 17.5f, 16.99f)
                curveTo(17.56f, 17.01f, 17.62f, 17.03f, 17.68f, 17.05f)
                curveTo(17.74f, 17.08f, 17.8f, 17.11f, 17.85f, 17.14f)
                curveTo(17.91f, 17.18f, 17.96f, 17.22f, 18.01f, 17.27f)
                curveTo(18.19f, 17.45f, 18.3f, 17.71f, 18.3f, 17.97f)
                curveTo(18.3f, 18.1f, 18.27f, 18.23f, 18.22f, 18.36f)
                curveTo(18.17f, 18.48f, 18.1f, 18.59f, 18.01f, 18.68f)
                curveTo(17.96f, 18.73f, 17.91f, 18.77f, 17.85f, 18.8f)
                curveTo(17.8f, 18.84f, 17.74f, 18.87f, 17.68f, 18.9f)
                curveTo(17.62f, 18.92f, 17.56f, 18.94f, 17.5f, 18.95f)
                curveTo(17.43f, 18.97f, 17.37f, 18.97f, 17.3f, 18.97f)
                close()
            }
        }.build()

        return _MonitorMobbile!!
    }

@Suppress("ObjectPropertyName")
private var _MonitorMobbile: ImageVector? = null
