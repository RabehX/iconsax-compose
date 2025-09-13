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

package io.github.rabehx.iconsax.filled


import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import io.github.rabehx.iconsax.Iconsax


val Iconsax.Filled.MonitorMobbile: ImageVector
    get() {
        if (_MonitorMobbile != null) {
            return _MonitorMobbile!!
        }
        _MonitorMobbile = ImageVector.Builder(
            name = "Filled.MonitorMobbile",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.99f, 9.71f)
                curveTo(20.65f, 9.57f, 20.2f, 9.5f, 19.64f, 9.5f)
                horizontalLineTo(14.36f)
                curveTo(12.62f, 9.5f, 12f, 10.12f, 12f, 11.88f)
                verticalLineTo(19.62f)
                curveTo(12f, 20.2f, 12.07f, 20.65f, 12.22f, 21f)
                curveTo(12.53f, 21.72f, 13.19f, 22f, 14.36f, 22f)
                horizontalLineTo(19.64f)
                curveTo(21.38f, 22f, 22f, 21.37f, 22f, 19.62f)
                verticalLineTo(11.88f)
                curveTo(22f, 10.69f, 21.72f, 10.02f, 20.99f, 9.71f)
                close()
                moveTo(18f, 19.75f)
                horizontalLineTo(16f)
                curveTo(15.98f, 19.75f, 15.95f, 19.75f, 15.93f, 19.74f)
                curveTo(15.78f, 19.73f, 15.65f, 19.68f, 15.54f, 19.58f)
                curveTo(15.36f, 19.45f, 15.25f, 19.24f, 15.25f, 19f)
                curveTo(15.25f, 18.59f, 15.59f, 18.25f, 16f, 18.25f)
                horizontalLineTo(18f)
                curveTo(18.41f, 18.25f, 18.75f, 18.59f, 18.75f, 19f)
                curveTo(18.75f, 19.41f, 18.41f, 19.75f, 18f, 19.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(20.99f, 6.19f)
                verticalLineTo(7f)
                curveTo(20.99f, 7.55f, 20.54f, 8f, 19.99f, 8f)
                horizontalLineTo(14.36f)
                curveTo(11.8f, 8f, 10.5f, 9.31f, 10.5f, 11.88f)
                verticalLineTo(21f)
                curveTo(10.5f, 21.55f, 10.05f, 22f, 9.5f, 22f)
                horizontalLineTo(7.55f)
                curveTo(7.15f, 22f, 6.83f, 21.68f, 6.83f, 21.29f)
                curveTo(6.83f, 20.89f, 7.15f, 20.58f, 7.55f, 20.58f)
                horizontalLineTo(9.5f)
                verticalLineTo(16.75f)
                horizontalLineTo(6f)
                curveTo(3.78f, 16.64f, 2.01f, 14.81f, 2.01f, 12.56f)
                verticalLineTo(6.19f)
                curveTo(2.01f, 3.88f, 3.89f, 2f, 6.21f, 2f)
                horizontalLineTo(16.8f)
                curveTo(19.11f, 2f, 20.99f, 3.88f, 20.99f, 6.19f)
                close()
            }
        }.build()

        return _MonitorMobbile!!
    }

@Suppress("ObjectPropertyName")
private var _MonitorMobbile: ImageVector? = null
