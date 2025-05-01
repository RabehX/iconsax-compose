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

val Iconsax.Outline.ThreeDCubeScan: ImageVector
    get() {
        if (_3DCubeScan != null) {
            return _3DCubeScan!!
        }
        _3DCubeScan = ImageVector.Builder(
            name = "Outline.3DCubeScan",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(22f, 9.75f)
                curveTo(21.59f, 9.75f, 21.25f, 9.41f, 21.25f, 9f)
                verticalLineTo(7f)
                curveTo(21.25f, 4.42f, 19.58f, 2.75f, 17f, 2.75f)
                horizontalLineTo(7f)
                curveTo(4.42f, 2.75f, 2.75f, 4.42f, 2.75f, 7f)
                verticalLineTo(9f)
                curveTo(2.75f, 9.41f, 2.41f, 9.75f, 2f, 9.75f)
                curveTo(1.59f, 9.75f, 1.25f, 9.41f, 1.25f, 9f)
                verticalLineTo(7f)
                curveTo(1.25f, 3.56f, 3.56f, 1.25f, 7f, 1.25f)
                horizontalLineTo(17f)
                curveTo(20.44f, 1.25f, 22.75f, 3.56f, 22.75f, 7f)
                verticalLineTo(9f)
                curveTo(22.75f, 9.41f, 22.41f, 9.75f, 22f, 9.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17f, 22.75f)
                horizontalLineTo(7f)
                curveTo(3.56f, 22.75f, 1.25f, 20.44f, 1.25f, 17f)
                verticalLineTo(15f)
                curveTo(1.25f, 14.59f, 1.59f, 14.25f, 2f, 14.25f)
                curveTo(2.41f, 14.25f, 2.75f, 14.59f, 2.75f, 15f)
                verticalLineTo(17f)
                curveTo(2.75f, 19.58f, 4.42f, 21.25f, 7f, 21.25f)
                horizontalLineTo(17f)
                curveTo(19.58f, 21.25f, 21.25f, 19.58f, 21.25f, 17f)
                verticalLineTo(15f)
                curveTo(21.25f, 14.59f, 21.59f, 14.25f, 22f, 14.25f)
                curveTo(22.41f, 14.25f, 22.75f, 14.59f, 22.75f, 15f)
                verticalLineTo(17f)
                curveTo(22.75f, 20.44f, 20.44f, 22.75f, 17f, 22.75f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12.001f, 13.08f)
                curveTo(11.871f, 13.08f, 11.741f, 13.05f, 11.621f, 12.98f)
                lineTo(6.321f, 9.92f)
                curveTo(5.961f, 9.71f, 5.841f, 9.25f, 6.051f, 8.89f)
                curveTo(6.261f, 8.53f, 6.721f, 8.41f, 7.071f, 8.62f)
                lineTo(11.991f, 11.47f)
                lineTo(16.881f, 8.64f)
                curveTo(17.241f, 8.43f, 17.701f, 8.56f, 17.901f, 8.91f)
                curveTo(18.111f, 9.27f, 17.981f, 9.73f, 17.631f, 9.94f)
                lineTo(12.371f, 12.98f)
                curveTo(12.261f, 13.04f, 12.131f, 13.08f, 12.001f, 13.08f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 18.52f)
                curveTo(11.59f, 18.52f, 11.25f, 18.18f, 11.25f, 17.77f)
                verticalLineTo(12.33f)
                curveTo(11.25f, 11.92f, 11.59f, 11.58f, 12f, 11.58f)
                curveTo(12.41f, 11.58f, 12.75f, 11.92f, 12.75f, 12.33f)
                verticalLineTo(17.77f)
                curveTo(12.75f, 18.18f, 12.41f, 18.52f, 12f, 18.52f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(12f, 18.75f)
                curveTo(11.42f, 18.75f, 10.85f, 18.62f, 10.39f, 18.37f)
                lineTo(7.19f, 16.59f)
                curveTo(6.23f, 16.06f, 5.49f, 14.79f, 5.49f, 13.69f)
                verticalLineTo(10.3f)
                curveTo(5.49f, 9.21f, 6.24f, 7.94f, 7.19f, 7.4f)
                lineTo(10.39f, 5.62f)
                curveTo(11.31f, 5.11f, 12.69f, 5.11f, 13.61f, 5.62f)
                lineTo(16.81f, 7.4f)
                curveTo(17.77f, 7.93f, 18.51f, 9.2f, 18.51f, 10.3f)
                verticalLineTo(13.69f)
                curveTo(18.51f, 14.78f, 17.76f, 16.05f, 16.81f, 16.59f)
                lineTo(13.61f, 18.37f)
                curveTo(13.15f, 18.62f, 12.58f, 18.75f, 12f, 18.75f)
                close()
                moveTo(11.12f, 6.94f)
                lineTo(7.92f, 8.72f)
                curveTo(7.43f, 8.99f, 6.99f, 9.75f, 6.99f, 10.3f)
                verticalLineTo(13.69f)
                curveTo(6.99f, 14.25f, 7.43f, 15f, 7.92f, 15.27f)
                lineTo(11.12f, 17.05f)
                curveTo(11.58f, 17.3f, 12.42f, 17.3f, 12.88f, 17.05f)
                lineTo(16.08f, 15.27f)
                curveTo(16.57f, 15f, 17.01f, 14.24f, 17.01f, 13.69f)
                verticalLineTo(10.3f)
                curveTo(17.01f, 9.74f, 16.57f, 8.99f, 16.08f, 8.72f)
                lineTo(12.88f, 6.94f)
                curveTo(12.42f, 6.69f, 11.58f, 6.69f, 11.12f, 6.94f)
                close()
            }
        }.build()

        return _3DCubeScan!!
    }

@Suppress("ObjectPropertyName")
private var _3DCubeScan: ImageVector? = null
