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

val Iconsax.Filled.ThreeDCubeScan: ImageVector
    get() {
        if (_3DCubeScan != null) {
            return _3DCubeScan!!
        }
        _3DCubeScan = ImageVector.Builder(
            name = "Filled.3DCubeScan",
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
                moveTo(16.4f, 8.211f)
                lineTo(12.64f, 6.181f)
                curveTo(12.24f, 5.971f, 11.77f, 5.971f, 11.37f, 6.181f)
                lineTo(7.6f, 8.211f)
                curveTo(7.33f, 8.361f, 7.16f, 8.651f, 7.16f, 8.971f)
                curveTo(7.16f, 9.301f, 7.33f, 9.591f, 7.6f, 9.741f)
                lineTo(11.36f, 11.771f)
                curveTo(11.56f, 11.881f, 11.78f, 11.931f, 12f, 11.931f)
                curveTo(12.22f, 11.931f, 12.44f, 11.881f, 12.64f, 11.771f)
                lineTo(16.4f, 9.741f)
                curveTo(16.67f, 9.591f, 16.84f, 9.301f, 16.84f, 8.971f)
                curveTo(16.84f, 8.651f, 16.67f, 8.361f, 16.4f, 8.211f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(10.74f, 12.469f)
                lineTo(7.24f, 10.719f)
                curveTo(6.97f, 10.589f, 6.66f, 10.599f, 6.4f, 10.759f)
                curveTo(6.15f, 10.918f, 6f, 11.189f, 6f, 11.488f)
                verticalLineTo(14.799f)
                curveTo(6f, 15.368f, 6.32f, 15.889f, 6.83f, 16.139f)
                lineTo(10.33f, 17.889f)
                curveTo(10.45f, 17.948f, 10.58f, 17.979f, 10.72f, 17.979f)
                curveTo(10.88f, 17.979f, 11.03f, 17.938f, 11.17f, 17.848f)
                curveTo(11.43f, 17.688f, 11.58f, 17.419f, 11.58f, 17.118f)
                verticalLineTo(13.809f)
                curveTo(11.57f, 13.238f, 11.26f, 12.729f, 10.74f, 12.469f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000))) {
                moveTo(17.592f, 10.759f)
                curveTo(17.332f, 10.599f, 17.022f, 10.589f, 16.752f, 10.719f)
                lineTo(13.252f, 12.469f)
                curveTo(12.742f, 12.729f, 12.422f, 13.238f, 12.422f, 13.809f)
                verticalLineTo(17.118f)
                curveTo(12.422f, 17.419f, 12.572f, 17.688f, 12.832f, 17.848f)
                curveTo(12.972f, 17.938f, 13.122f, 17.979f, 13.282f, 17.979f)
                curveTo(13.412f, 17.979f, 13.542f, 17.948f, 13.672f, 17.889f)
                lineTo(17.172f, 16.139f)
                curveTo(17.682f, 15.878f, 18.002f, 15.368f, 18.002f, 14.799f)
                verticalLineTo(11.488f)
                curveTo(18.002f, 11.189f, 17.852f, 10.918f, 17.592f, 10.759f)
                close()
            }
        }.build()

        return _3DCubeScan!!
    }

@Suppress("ObjectPropertyName")
private var _3DCubeScan: ImageVector? = null
